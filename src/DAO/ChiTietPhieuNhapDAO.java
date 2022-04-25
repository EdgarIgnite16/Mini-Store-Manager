package DAO;

import DTO.ChiTietPhieuNhapDTO;

import java.sql.Connection;
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
}
