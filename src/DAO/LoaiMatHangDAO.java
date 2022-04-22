package DAO;

import DTO.LoaiMatHangDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoaiMatHangDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<LoaiMatHangDTO> getData() throws Exception {
        String sql = "Select * from dbo.LoaiMatHang";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<LoaiMatHangDTO> listMatHang = new ArrayList<LoaiMatHangDTO>();
                while(rs.next()) {
                    LoaiMatHangDTO loaiMatHangDTO = new LoaiMatHangDTO();
                    loaiMatHangDTO.setMaLMH(rs.getString("maLMH").trim());
                    loaiMatHangDTO.setTenLMH(rs.getString("tenLMH").trim());
                    listMatHang.add(loaiMatHangDTO);
                }
                return listMatHang;
            }
        }
    }
}
