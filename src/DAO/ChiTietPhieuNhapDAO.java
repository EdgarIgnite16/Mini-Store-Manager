package DAO;

import DTO.ChiTietPhieuNhapDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ChiTietPhieuNhapDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<ChiTietPhieuNhapDTO> getData() throws Exception {
        String sql = "Select * from dbo.CTPN";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<ChiTietPhieuNhapDTO> listChiTietPhieuNhap = new ArrayList<ChiTietPhieuNhapDTO>();
                while (rs.next()) {
                    ChiTietPhieuNhapDTO chiTietPhieuNhapDTO = new ChiTietPhieuNhapDTO();
                    chiTietPhieuNhapDTO.setMaPhieuNhap(rs.getString("maPhieuNhap").trim());
                    chiTietPhieuNhapDTO.setMaMH(rs.getString("maMH").trim());
                    chiTietPhieuNhapDTO.setSoLuong(rs.getInt("soLuong"));
                    listChiTietPhieuNhap.add(chiTietPhieuNhapDTO);
                }
                return listChiTietPhieuNhap;
            }
        }
    }

    public boolean insertItem(ChiTietPhieuNhapDTO chiTietPhieuNhapDTO) throws Exception {
        String sql = "INSERT INTO [dbo].[CTPN] ([maPhieuNhap], [maMH], [soLuong])" +
                " VALUES(?, ?, ?)";

        // sử dụng try with resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, chiTietPhieuNhapDTO.getMaPhieuNhap());
                pstm.setString(2, chiTietPhieuNhapDTO.getMaMH());
                pstm.setInt(3, chiTietPhieuNhapDTO.getSoLuong());

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
