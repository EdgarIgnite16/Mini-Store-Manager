package DAO;

import DTO.ChiTietPhieuNhapDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ChiTietPhieuNhapDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<ChiTietPhieuNhapDTO> getData() throws Exception {
        String sql = "Select * from dbo.CTPN";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
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
}
