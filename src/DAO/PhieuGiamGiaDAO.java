package DAO;

import DTO.ChucVuDTO;
import DTO.PhieuGiamGiaDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PhieuGiamGiaDAO {
    public ArrayList<PhieuGiamGiaDTO> getData() throws Exception {
        String sql = "Select * from dbo.PhieuGiamGia";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<PhieuGiamGiaDTO> listPhieuGiamGia = new ArrayList<PhieuGiamGiaDTO>();
                while(rs.next()) {
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
