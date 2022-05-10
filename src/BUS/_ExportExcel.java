package BUS;

import DTO.HoaDonDTO;
import DTO.MatHangDTO;
import DTO.PhieuNhapHangDTO;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.status.StatusLogger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class _ExportExcel {

    // xuất dữ liệu mặt hàng
    public static void ExportMatHang(ArrayList<MatHangDTO> listMH, String path) {
        try {
            StatusLogger.getLogger().setLevel(Level.OFF);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Mặt hàng");

            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(0);

            // config cột
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã mặt hàng");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Mã loại mặt hàng");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Tên mặt hàng");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Thành tiền");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Số lượng");

            // config dòng
            for (int i = 0; i < listMH.size(); i++) {
                row = sheet.createRow(i + 1);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(listMH.get(i).getMaMH());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(listMH.get(i).getMaLMH());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(listMH.get(i).getTenMH());

                cell = row.createCell(3, CellType.NUMERIC);
                cell.setCellValue(listMH.get(i).getThanhTien());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(listMH.get(i).getSoLuong());
            }

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);


            File file = new File(path);
            try {
                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // xuất dữ liệu hoá đơn
    public static void ExportHoaDon(ArrayList<HoaDonDTO> listHD, String path) {
        try {
            StatusLogger.getLogger().setLevel(Level.OFF);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Hoá Đơn");

            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(0);

            // config cột
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã hoá đơn");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Mã nhân viên");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Mã khách hàng");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Mã giảm giá");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Tổng hoá đơn");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Ngày bán");

            // config dòng
            for (int i = 0; i < listHD.size(); i++) {
                row = sheet.createRow(i + 1);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(listHD.get(i).getMaHD());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(listHD.get(i).getMaNV());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(listHD.get(i).getMaKH());

                cell = row.createCell(3, CellType.NUMERIC);
                cell.setCellValue(listHD.get(i).getMaGiamGia());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(listHD.get(i).getTongHoaDon());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(listHD.get(i).getNgayBan());
            }

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);
            sheet.autoSizeColumn(5);


            File file = new File(path);
            try {
                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // xuất dữ liệu phiếu nhập hàng
    public static void ExportPhieuNhap(ArrayList<PhieuNhapHangDTO> listPN, String path) {
        try {
            StatusLogger.getLogger().setLevel(Level.OFF);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Phiếu nhập hàng");

            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(0);

            // config cột
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Mã phiếu nhập");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Mã nhà cung cấp");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Ngày nhập");

            // config dòng
            for (int i = 0; i < listPN.size(); i++) {
                row = sheet.createRow(i + 1);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(listPN.get(i).getMaPhieuNhap());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(listPN.get(i).getMaNCC());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(listPN.get(i).getNgayNhap());
            }

            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);

            File file = new File(path);
            try {
                FileOutputStream fos = new FileOutputStream(file);
                workbook.write(fos);
                fos.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
