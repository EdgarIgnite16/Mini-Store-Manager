package DAO;

import DTO.KhachHangDTO;
import DTO.PhieuNhapHangDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PhieuNhapHangDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<PhieuNhapHangDTO> getData() throws Exception {
        String sql = "Select * from dbo.PhieuNhapHang";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<PhieuNhapHangDTO> listPhieuNhapHang = new ArrayList<PhieuNhapHangDTO>();
                while (rs.next()) {
                    PhieuNhapHangDTO phieuNhapHangDTO = new PhieuNhapHangDTO();
                    phieuNhapHangDTO.setMaPhieuNhap(rs.getString("maPhieuNhap").trim());
                    phieuNhapHangDTO.setMaNCC(rs.getString("maNCC").trim());
                    phieuNhapHangDTO.setNgayNhap(rs.getString("ngayNhap").trim());
                    listPhieuNhapHang.add(phieuNhapHangDTO);
                }
                return listPhieuNhapHang;
            }
        }
    }
    public boolean insertItem(PhieuNhapHangDTO phieuNhapHangDTO) throws Exception {
        String sql = "INSERT INTO [dbo].[PhieuNhapHang] ([maPhieuNhap] ,[maNCC] ,[ngayNhap])" +
                " VALUES(?, ?, ?)";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, phieuNhapHangDTO.getMaPhieuNhap());
                pstm.setString(2, phieuNhapHangDTO.getMaNCC());
                pstm.setString(3, phieuNhapHangDTO.getNgayNhap());

                boolean checkPSTM = pstm.executeUpdate() > 0;
                conn.commit(); // commit thay đổi lên database
                conn.setAutoCommit(true); // set AutoCommit lại thành true

                // nếu executeUpdate trả về hơn 1 => query thành công
                // ngược lại => query thất bại
                return checkPSTM;
            } catch (Exception ex) {
                conn.rollback(); // transactions roll back nếu sql thực thi thất bại
            }
        }
        return false;
    }

    // hàm update dữ liệu lên database
    public boolean updateItem(PhieuNhapHangDTO phieuNhapHangDTO) throws Exception {
        String sql = "UPDATE [dbo].[PhieuNhap] " +
                "SET [maPhieuNhap] =  ?, [maNCC] = ?, [ngayNhap] = ?" +
                " WHERE [maPhieuNhap] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, phieuNhapHangDTO.getMaPhieuNhap());
                pstm.setString(2, phieuNhapHangDTO.getMaNCC());
                pstm.setString(3, phieuNhapHangDTO.getNgayNhap());
                pstm.setString(4, phieuNhapHangDTO.getMaPhieuNhap());

                boolean checkPSTM = pstm.executeUpdate() > 0;
                conn.commit(); // commit thay đổi lên database
                conn.setAutoCommit(true); // set AutoCommit lại thành true

                // nếu executeUpdate trả về hơn 1 => query thành công
                // ngược lại => query thất bại
                return checkPSTM;
            } catch (Exception ex) {
                conn.rollback(); // transactions roll back nếu sql thực thi thất bại
            }
        }
        return false;
    }

    // hàm delete dữ liệu lên database
    public boolean deleteItem(PhieuNhapHangDTO phieuNhapHangDTO) throws Exception {
        String sql = "DELETE FROM [dbo].[PhieuNhapHang] " +
                " WHERE [maPhieuNhap] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, phieuNhapHangDTO.getMaPhieuNhap());

                boolean checkPSTM = pstm.executeUpdate() > 0;
                conn.commit(); // commit thay đổi lên database
                conn.setAutoCommit(true); // set AutoCommit lại thành true

                // nếu executeUpdate trả về hơn 1 => query thành công
                // ngược lại => query thất bại
                return checkPSTM;
            } catch (Exception ex) {
                conn.rollback(); // transactions roll back nếu sql thực thi thất bại
            }
        }
        return false;
    }
}

