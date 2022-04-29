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
                ArrayList<MatHangDTO> listMatHang = new ArrayList<MatHangDTO>();
                while (rs.next()) {
                    MatHangDTO matHangDTO = new MatHangDTO();
                    matHangDTO.setMaMH(rs.getString("maMH").trim());
                    matHangDTO.setMaLMH(rs.getString("maLMH").trim());
                    matHangDTO.setTenMH(rs.getString("tenMatHang").trim());
                    matHangDTO.setThanhTien(rs.getFloat("thanhTien"));
                    matHangDTO.setSoLuong(rs.getInt("soLuong"));
                    listMatHang.add(matHangDTO);
                }
                return listMatHang;
            }
        }
    }

    public boolean updateItem(MatHangDTO matHangDTO) throws Exception {
        String sql = "UPDATE [dbo].[MatHang] " +
                "SET [maMH] = ?, [maLMH] = ?, [tenMatHang] = ?, [thanhTien] = ?, [soLuong] = ?" +
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
                pstm.setString(6, matHangDTO.getMaMH());

                boolean checkPSTM = pstm.executeUpdate() > 0;
                conn.commit(); // commit thay đổi lên database
                conn.setAutoCommit(true); // set AutoCommit lại thành true

                // nếu executeUpdate trả về hơn 1 => query thành công
                // ngược lại => query thất bại
                return checkPSTM;
            } catch (Exception ex) {
                conn.rollback(); // transactions roll back nếu sql thực thi thất bại
                throw new Exception(); // trả về một exception nếu câu lệnh sql bị lỗi
            }
        }
    }
}
