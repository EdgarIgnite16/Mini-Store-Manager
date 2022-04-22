package DAO;

import DTO.ChiTietHoaDonDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ChiTietHoaDonDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<ChiTietHoaDonDTO> getData() throws Exception {
        String sql = "Select * from dbo.CTHD";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<ChiTietHoaDonDTO> listChiTietHoaDon = new ArrayList<ChiTietHoaDonDTO>();
                while (rs.next()) {
                    ChiTietHoaDonDTO chiTietHoaDonDTO = new ChiTietHoaDonDTO();
                    chiTietHoaDonDTO.setMaMH(rs.getString("maHD").trim());
                    chiTietHoaDonDTO.setMaMH(rs.getString("maMH").trim());
                    chiTietHoaDonDTO.setSoLuong(rs.getInt("soLuong"));
                    listChiTietHoaDon.add(chiTietHoaDonDTO);
                }
                return listChiTietHoaDon;
            }
        }
    }
}
