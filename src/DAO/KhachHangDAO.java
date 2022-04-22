package DAO;

import DTO.KhachHangDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KhachHangDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<KhachHangDTO> getData() throws Exception {
        String sql = "Select * from dbo.KhachHang";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<KhachHangDTO> listKhachHang = new ArrayList<KhachHangDTO>();
                while(rs.next()) {
                    KhachHangDTO khachHangDTO = new KhachHangDTO();
                    khachHangDTO.setMaKH(rs.getString("maKH").trim());
                    khachHangDTO.setTenKH(rs.getString("tenKH").trim());
                    khachHangDTO.setSdt(rs.getString("SDT").trim());
                    listKhachHang.add(khachHangDTO);
                }
                return listKhachHang;
            }
        }
    }
}
