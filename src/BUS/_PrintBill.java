package BUS;

import DTO.HoaDonDTO;
import DTO.MatHangDTO;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.regex.Pattern;


public class _PrintBill {
    private static final Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);
    private static final Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
    private static final Font NorFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL);
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

    private static String fileName;
    private static HoaDonDTO hoaDonDTO;
    private static ArrayList<MatHangDTO> listSP;

    // hàm khởi tạo và in Bill hoá đơn
    public static void printBill(String iFileName, HoaDonDTO iHoaDonDTO, ArrayList<MatHangDTO> iListSP) {
        try {
            // các thông số nhận vào
            fileName = iFileName;
            hoaDonDTO = iHoaDonDTO;
            listSP = iListSP;

            String basePath = new File("").getAbsolutePath();
            String path = basePath + "\\resource\\bill list\\" + fileName + ".pdf";
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            addMetaData(document);
            addMainData(document);
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // hàm tạo metadata
    private static void addMetaData(Document document) {
        document.addTitle(String.format("Hoá đơn %s", fileName));
        document.addAuthor("Phần mềm quản lí cửa hàng tiện lợi MiniStore");
        document.addCreator("Phần mềm quản lí cửa hàng tiện lợi MiniStore");
        document.addKeywords("Java, PDF, iText");
    }

    // hàm tạo dữ liệu chính
    private static void addMainData(Document document) throws DocumentException {
        Anchor anchor = new Anchor(fileName, catFont);
        anchor.setName(fileName);

        Paragraph maHD = new Paragraph("Ma hoa don: " + hoaDonDTO.getMaHD(), NorFont);
        Paragraph maGiamGia = new Paragraph("Ma giam gia: " + hoaDonDTO.getMaGiamGia(), NorFont);
        Paragraph ngayBan = new Paragraph("Ngay ban: " + hoaDonDTO.getNgayBan(), NorFont);
        Paragraph tenNhanVien = new Paragraph("Ten nhan vien: " + removeAccent(new NhanVienBUS().getItemByID(hoaDonDTO.getMaNV()).getTenNV()), NorFont);
        Paragraph tenKhachHang = new Paragraph("Ten khach hang: " + removeAccent(new KhachHangBUS().getItemById(hoaDonDTO.getMaKH()).getTenKH()), NorFont);
        Paragraph tongHoaDon = new Paragraph("Tong hoa don: " + hoaDonDTO.getTongHoaDon() + "VND", NorFont);

        Chapter catPart = new Chapter(new Paragraph("Thong tin hoa don " + anchor, catFont), 1);
        Paragraph subPara = new Paragraph("Thong tin chi tiet", subFont);
        Section subCatPart = catPart.addSection(subPara);
        subCatPart.add(maHD);
        subCatPart.add(maGiamGia);
        subCatPart.add(ngayBan);
        subCatPart.add(tenNhanVien);
        subCatPart.add(tenKhachHang);
        subCatPart.add(tongHoaDon);

        // tạo dòng trống
        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 2);
        subCatPart.add(paragraph);

        subPara = new Paragraph("Bang thong ke chi tiet san pham da mua", subFont);
        subCatPart = catPart.addSection(subPara);

        Paragraph paragraph2 = new Paragraph();
        addEmptyLine(paragraph2, 1);
        subCatPart.add(paragraph2);

        createTable(subCatPart); // tạo bảng dữ liệu

        // Thêm tất cả dữ liệu vào file
        document.add(catPart);
    }

    // hàm tạo bảng
    private static void createTable(Section subCatPart) {
        PdfPTable table = new PdfPTable(4);

        // khởi tạo header table
        PdfPCell c1 = new PdfPCell(new Phrase("Ma san pham"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Ten san pham"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("So luong"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        c1 = new PdfPCell(new Phrase("Thanh tien (VND)"));
        c1.setHorizontalAlignment(Element.ALIGN_CENTER);
        table.addCell(c1);

        // khởi tạo dữ liệu cho bảng
        table.setHeaderRows(1);
        for (MatHangDTO item : listSP) {
            table.addCell(removeAccent(item.getMaMH()));
            table.addCell(removeAccent(item.getTenMH()));
            table.addCell(String.valueOf(item.soLuong_hientai));
            table.addCell(String.valueOf(item.thanhTien_hientai));
        }
        subCatPart.add(table);
    }

    // hàm tạo dòng trống
    private static void addEmptyLine(Paragraph preface, int number) {
        for (int i = 0; i < number; i++) {
            preface.add(new Paragraph(" "));
        }
    }

    // hàm chuyển đổi chữ có dấu sang chữ ko dấu
    public static String removeAccent(String s) {
        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "d");
    }
}
