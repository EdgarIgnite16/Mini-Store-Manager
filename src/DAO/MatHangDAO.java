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
                Statement stm = conn.createStatement();
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


    public ArrayList<MatHangDTO> getDataTest() throws Exception {
        ArrayList<MatHangDTO> listFood = new ArrayList<>();
        listFood.add(new MatHangDTO("MH01", "FOOD", "Com chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Com chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Com chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Com chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Com chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Com chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));
        listFood.add(new MatHangDTO("MH01", "FOOD", "Mi chien gion", (float) 15999.9, 12));

        return listFood;
    }
}
