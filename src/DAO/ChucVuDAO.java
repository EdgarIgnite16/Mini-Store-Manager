package DAO;

import DTO.CaLamViecDTO;
import DTO.ChucVuDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ChucVuDAO {
    public ArrayList<ChucVuDTO> getData() throws Exception {
        String sql = "Select * from dbo.ChucVu";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<ChucVuDTO> listChucVu = new ArrayList<ChucVuDTO>();
                while(rs.next()) {
                    ChucVuDTO chucVuDTO = new ChucVuDTO();
                    chucVuDTO.setMaCV(rs.getString("maCV").trim());
                    chucVuDTO.setTenCV(rs.getString("tenCV").trim());
                    listChucVu.add(chucVuDTO);
                }
                return listChucVu;
            }
        }
    }
}
