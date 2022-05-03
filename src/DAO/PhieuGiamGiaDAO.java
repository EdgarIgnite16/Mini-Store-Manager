package DAO;

import DTO.PhieuGiamGiaDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PhieuGiamGiaDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<PhieuGiamGiaDTO> getData() throws Exception {
        String sql = "Select * from dbo.PhieuGiamGia";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<PhieuGiamGiaDTO> listPhieuGiamGia = new ArrayList<PhieuGiamGiaDTO>();
                while (rs.next()) {
                    PhieuGiamGiaDTO phieuGiamGiaDTO = new PhieuGiamGiaDTO();
                    phieuGiamGiaDTO.setMaGiamGia(rs.getString("maGiamGia").trim());
                    phieuGiamGiaDTO.setTenGiamGia(rs.getString("tenGiamGia").trim());
                    phieuGiamGiaDTO.setNoiDung(rs.getString("noiDung").trim());
                    phieuGiamGiaDTO.setTiLeGiam(rs.getFloat("tiLeGiam"));
                    listPhieuGiamGia.add(phieuGiamGiaDTO);
                }
                return listPhieuGiamGia;
            }
        }
    }
}
