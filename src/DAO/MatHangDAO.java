package DAO;

import DTO.MatHangDTO;

import java.sql.Connection;
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
}
