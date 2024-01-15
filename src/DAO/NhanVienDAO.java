package DAO;

import DTO.NhanVienDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class NhanVienDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<NhanVienDTO> getData() throws Exception {
        String sql = "Select * from dbo.NhanVien";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<NhanVienDTO> listNhanVien = new ArrayList<NhanVienDTO>();
                while (rs.next()) {
                    NhanVienDTO nhanVienDTO = new NhanVienDTO();
                    nhanVienDTO.setMaNV(rs.getString("maNV").trim());
                    nhanVienDTO.setMaCV(rs.getString("maCV").trim());
                    nhanVienDTO.setMaCa(rs.getString("maCa").trim());
                    nhanVienDTO.setTenNV(rs.getString("tenNV").trim());
                    nhanVienDTO.setPwd(rs.getString("pwd").trim());
                    nhanVienDTO.setCccd(rs.getString("cccd").trim());
                    nhanVienDTO.setSdt(rs.getString("sdt").trim());
                    nhanVienDTO.setStatus(rs.getInt("status"));
                    listNhanVien.add(nhanVienDTO);
                }
                return listNhanVien;
            }
        }
    }

    // hàm insert dữ liệu lên database
    public boolean insertItem(NhanVienDTO nhanVienDTO) throws Exception {
        String sql = "INSERT INTO [dbo].[NhanVien] ([maNV] ,[maCV] ,[maCa], [tenNV], [pwd], [cccd], [sdt], [status])" +
                " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, nhanVienDTO.getMaNV());
                pstm.setString(2, nhanVienDTO.getMaCV());
                pstm.setString(3, nhanVienDTO.getMaCa());
                pstm.setString(4, nhanVienDTO.getTenNV());
                pstm.setString(5, "default");
                pstm.setString(6, nhanVienDTO.getCccd());
                pstm.setString(7, nhanVienDTO.getSdt());
                pstm.setInt(8, 1);

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
    public boolean updateItem(NhanVienDTO nhanVienDTO) throws Exception {
        String sql = "UPDATE [dbo].[NhanVien] " +
                "SET [maNV] =  ?, [maCV] = ?, [maCa] = ?, [tenNV] = ?, [cccd] = ?, [sdt] = ?, [status ] = ?" +
                " WHERE [maNV] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, nhanVienDTO.getMaNV());
                pstm.setString(2, nhanVienDTO.getMaCV());
                pstm.setString(3, nhanVienDTO.getMaCa());
                pstm.setString(4, nhanVienDTO.getTenNV());
                pstm.setString(5, nhanVienDTO.getCccd());
                pstm.setString(6, nhanVienDTO.getSdt());
                pstm.setInt(7, nhanVienDTO.getStatus());
                pstm.setString(8, nhanVienDTO.getMaNV());

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

    // hàm update trạng thái dữ liệu lên database
    public boolean updateChangeStatus(NhanVienDTO nhanVienDTO, int status) throws Exception {
        String sql = "UPDATE [dbo].[NhanVien] " +
                "SET [maNV] =  ?, [maCV] = ?, [maCa] = ?, [tenNV] = ?, [cccd] = ?, [sdt] = ?, [status ] = ?" +
                " WHERE [maNV] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, nhanVienDTO.getMaNV());
                pstm.setString(2, nhanVienDTO.getMaCV());
                pstm.setString(3, nhanVienDTO.getMaCa());
                pstm.setString(4, nhanVienDTO.getTenNV());
                pstm.setString(5, nhanVienDTO.getCccd());
                pstm.setString(6, nhanVienDTO.getSdt());
                pstm.setInt(7, status);
                pstm.setString(8, nhanVienDTO.getMaNV());

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
    public boolean deleteItem(NhanVienDTO nhanVienDTO) throws Exception {
        String sql = "DELETE FROM [dbo].[NhanVien] " +
                " WHERE [maNV] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, nhanVienDTO.getMaNV());

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
