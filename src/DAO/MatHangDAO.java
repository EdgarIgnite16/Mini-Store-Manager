package DAO;

import DTO.MatHangDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MatHangDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<MatHangDTO> getData() throws Exception {
        String sql = "Select * from dbo.MatHang";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<MatHangDTO> listMatHang = new ArrayList<>();
                while (rs.next()) {
                    MatHangDTO matHangDTO = new MatHangDTO();
                    matHangDTO.setMaMH(rs.getString("maMH").trim());
                    matHangDTO.setMaLMH(rs.getString("maLMH").trim());
                    matHangDTO.setTenMH(rs.getString("tenMatHang").trim());
                    matHangDTO.setThanhTien(rs.getFloat("thanhTien"));
                    matHangDTO.setSoLuong(rs.getInt("soLuong"));
                    matHangDTO.setStatus(rs.getInt("status"));
                    listMatHang.add(matHangDTO);
                }
                return listMatHang;
            }
        }
    }

    // hàm insert dữ liệu lên database
    public boolean insertItem(MatHangDTO matHangDTO) throws Exception {
        String sql = "INSERT INTO [dbo].[MatHang] ([maMH], [maLMH] ,[tenMatHang], [thanhTien], [soLuong], [status])" +
                " VALUES(?, ?, ?, ?, ?, ?)";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, matHangDTO.getMaMH());
                pstm.setString(2, matHangDTO.getMaLMH());
                pstm.setString(3, matHangDTO.getTenMH());
                pstm.setFloat(4, matHangDTO.getThanhTien());
                pstm.setInt(5, matHangDTO.getSoLuong());
                pstm.setInt(6, 1);

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
    public boolean updateItem(MatHangDTO matHangDTO) throws Exception {
        String sql = "UPDATE [dbo].[MatHang] " +
                "SET [maMH] = ?, [maLMH] = ?, [tenMatHang] = ?, [thanhTien] = ?, [soLuong] = ?, [status] = ?" +
                " WHERE [maMH] = ?";

        // sử dụng try with resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, matHangDTO.getMaMH());
                pstm.setString(2, matHangDTO.getMaLMH());
                pstm.setString(3, matHangDTO.getTenMH());
                pstm.setFloat(4, matHangDTO.getThanhTien());
                pstm.setInt(5, matHangDTO.getSoLuong());
                pstm.setInt(6, matHangDTO.getStatus());
                pstm.setString(7, matHangDTO.getMaMH());

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
    public boolean updateChangeStatus(MatHangDTO matHangDTO, int status) throws Exception {
        String sql = "UPDATE [dbo].[MatHang] " +
                "SET [maMH] = ?, [maLMH] = ?, [tenMatHang] = ?, [thanhTien] = ?, [soLuong] = ?, [status] = ?" +
                " WHERE [maMH] = ?";

        // sử dụng try with resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, matHangDTO.getMaMH());
                pstm.setString(2, matHangDTO.getMaLMH());
                pstm.setString(3, matHangDTO.getTenMH());
                pstm.setFloat(4, matHangDTO.getThanhTien());
                pstm.setInt(5, matHangDTO.getSoLuong());
                pstm.setInt(6, status);
                pstm.setString(7, matHangDTO.getMaMH());

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
    public boolean deleteItem(MatHangDTO matHangDTO) throws Exception {
        String sql = "DELETE FROM [dbo].[MatHang]" +
                " WHERE [maMH] = ?";

        // sử dụng try-with-resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, matHangDTO.getMaMH());

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

    // lọc dữ liệu thông qua tên mặt hàng
    public ArrayList<MatHangDTO> fillDataByTenMH(String tenMH) throws Exception {
        String sql = "SELECT * FROM [dbo].[MatHang] WHERE [tenMatHang] like N'%" + tenMH + "%'";

        // sử dụng try-with-resource
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<MatHangDTO> listMatHang = new ArrayList<>();
                while (rs.next()) {
                    MatHangDTO matHangDTO = new MatHangDTO();
                    matHangDTO.setMaMH(rs.getString("maMH").trim());
                    matHangDTO.setMaLMH(rs.getString("maLMH").trim());
                    matHangDTO.setTenMH(rs.getString("tenMatHang").trim());
                    matHangDTO.setThanhTien(rs.getFloat("thanhTien"));
                    matHangDTO.setSoLuong(rs.getInt("soLuong"));
                    matHangDTO.setStatus(rs.getInt("status"));
                    listMatHang.add(matHangDTO);
                }
                return listMatHang;
            }
        }
    }

    // lọc dữ liệu thông qua loại mặt hàng
    public ArrayList<MatHangDTO> fillDataByLoaiMH(String maLoaiMatHang) throws Exception {
        String sql = "SELECT * FROM [dbo].[MatHang] WHERE [maLMH] = '" + maLoaiMatHang + "'";

        // sử dụng try-with-resource
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<MatHangDTO> listMatHang = new ArrayList<>();
                while (rs.next()) {
                    MatHangDTO matHangDTO = new MatHangDTO();
                    matHangDTO.setMaMH(rs.getString("maMH").trim());
                    matHangDTO.setMaLMH(rs.getString("maLMH").trim());
                    matHangDTO.setTenMH(rs.getString("tenMatHang").trim());
                    matHangDTO.setThanhTien(rs.getFloat("thanhTien"));
                    matHangDTO.setSoLuong(rs.getInt("soLuong"));
                    matHangDTO.setStatus(rs.getInt("status"));
                    listMatHang.add(matHangDTO);
                }
                return listMatHang;
            }
        }
    }

    // lọc dữ liệu thông qua tên mặt hàng và loại mặt hàng
    public ArrayList<MatHangDTO> fillDataByTenMH_LoaiMH(String tenMH, String maLoaiMatHang) throws Exception {
        String sql = "SELECT * FROM [dbo].[MatHang] WHERE [maLMH] = '" + maLoaiMatHang + "' AND [tenMatHang] like N'%" + tenMH + "%'";

        // sử dụng try-with-resource
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<MatHangDTO> listMatHang = new ArrayList<>();
                while (rs.next()) {
                    MatHangDTO matHangDTO = new MatHangDTO();
                    matHangDTO.setMaMH(rs.getString("maMH").trim());
                    matHangDTO.setMaLMH(rs.getString("maLMH").trim());
                    matHangDTO.setTenMH(rs.getString("tenMatHang").trim());
                    matHangDTO.setThanhTien(rs.getFloat("thanhTien"));
                    matHangDTO.setSoLuong(rs.getInt("soLuong"));
                    matHangDTO.setStatus(rs.getInt("status"));
                    listMatHang.add(matHangDTO);
                }
                return listMatHang;
            }
        }
    }
}
