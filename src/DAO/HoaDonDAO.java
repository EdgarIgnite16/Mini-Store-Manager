package DAO;

import DTO.HoaDonDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class HoaDonDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<HoaDonDTO> getData() throws Exception {
        String sql = "Select * from dbo.HoaDon";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<HoaDonDTO> listHoaDon = new ArrayList<HoaDonDTO>();
                while (rs.next()) {
                    HoaDonDTO hoaDonDTO = new HoaDonDTO();
                    hoaDonDTO.setMaHD(rs.getString("maHD").trim());
                    hoaDonDTO.setMaNV(rs.getString("maNV").trim());
                    hoaDonDTO.setMaKH(rs.getString("maKH").trim());
                    hoaDonDTO.setMaGiamGia(rs.getString("maGiamGia").trim());
                    hoaDonDTO.setNgayBan(rs.getString("ngayBan").trim());
                    hoaDonDTO.setTongHoaDon(rs.getFloat("tongHoaDon"));
                    hoaDonDTO.setTrangThai(rs.getInt("ngayBan"));
                    listHoaDon.add(hoaDonDTO);
                }
                return listHoaDon;
            }
        }
    }
}
