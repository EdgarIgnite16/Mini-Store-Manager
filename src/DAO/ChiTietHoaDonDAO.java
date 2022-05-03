package DAO;

import DTO.ChiTietHoaDonDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ChiTietHoaDonDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<ChiTietHoaDonDTO> getData() throws Exception {
        String sql = "Select * from dbo.CTHD";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<ChiTietHoaDonDTO> listChiTietHoaDon = new ArrayList<ChiTietHoaDonDTO>();
                while (rs.next()) {
                    ChiTietHoaDonDTO chiTietHoaDonDTO = new ChiTietHoaDonDTO();
                    chiTietHoaDonDTO.setMaHD(rs.getString("maHD").trim());
                    chiTietHoaDonDTO.setMaMH(rs.getString("maMH").trim());
                    chiTietHoaDonDTO.setSoLuong(rs.getInt("soLuong"));
                    listChiTietHoaDon.add(chiTietHoaDonDTO);
                }
                return listChiTietHoaDon;
            }
        }
    }

    // hàm insert dữ liệu lên database
    public boolean insertItem(ChiTietHoaDonDTO chiTietHoaDonDTO) throws Exception {
        String sql = "INSERT INTO [dbo].[CTHD] ([maHD], [maMH], [soLuong])" +
                " VALUES(?, ?, ?)";

        // sử dụng try with resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, chiTietHoaDonDTO.getMaHD());
                pstm.setString(2, chiTietHoaDonDTO.getMaMH());
                pstm.setInt(3, chiTietHoaDonDTO.getSoLuong());

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
