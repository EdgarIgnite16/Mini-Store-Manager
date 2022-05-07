package DAO;

import DTO.KhachHangDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class KhachHangDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<KhachHangDTO> getData() throws Exception {
        String sql = "Select * from dbo.KhachHang";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<KhachHangDTO> listKhachHang = new ArrayList<KhachHangDTO>();
                while (rs.next()) {
                    KhachHangDTO khachHangDTO = new KhachHangDTO();
                    khachHangDTO.setMaKH(rs.getString("maKH").trim());
                    khachHangDTO.setTenKH(rs.getString("tenKH").trim());
                    khachHangDTO.setSdt(rs.getString("SDT").trim());
                    khachHangDTO.setStatus(rs.getInt("status"));
                    listKhachHang.add(khachHangDTO);
                }
                return listKhachHang;
            }
        }
    }

    // hàm insert dữ liệu lên database
    public boolean insertItem(KhachHangDTO khachHangDTO) throws Exception {
        String sql = "INSERT INTO [dbo].[KhachHang] ([maKH] ,[tenKH] ,[SDT], [status])" +
                " VALUES(?, ?, ?, ?)";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, khachHangDTO.getMaKH());
                pstm.setString(2, khachHangDTO.getTenKH());
                pstm.setString(3, khachHangDTO.getSdt());
                pstm.setInt(4, 1);

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
    public boolean updateItem(KhachHangDTO khachHangDTO) throws Exception {
        String sql = "UPDATE [dbo].[KhachHang] " +
                "SET [maKH] =  ?, [tenKH] = ?, [SDT] = ?, [status] = ?" +
                " WHERE [maKH] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, khachHangDTO.getMaKH());
                pstm.setString(2, khachHangDTO.getTenKH());
                pstm.setString(3, khachHangDTO.getSdt());
                pstm.setInt(4, khachHangDTO.getStatus());
                pstm.setString(5, khachHangDTO.getMaKH());

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
    public boolean updateChangeStatus(KhachHangDTO khachHangDTO, int status) throws Exception {
        String sql = "UPDATE [dbo].[KhachHang] " +
                "SET [maKH] =  ?, [tenKH] = ?, [SDT] = ?, [status] = ?" +
                " WHERE [maKH] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, khachHangDTO.getMaKH());
                pstm.setString(2, khachHangDTO.getTenKH());
                pstm.setString(3, khachHangDTO.getSdt());
                pstm.setInt(4, status);
                pstm.setString(5, khachHangDTO.getMaKH());

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
    public boolean deleteItem(KhachHangDTO khachHangDTO) throws Exception {
        String sql = "DELETE FROM [dbo].[KhachHang] " +
                " WHERE [maKH] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, khachHangDTO.getMaKH());

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
