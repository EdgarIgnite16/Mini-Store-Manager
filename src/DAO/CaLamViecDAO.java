package DAO;

import DTO.CaLamViecDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CaLamViecDAO {
    public ArrayList<CaLamViecDTO> getData() throws Exception {
        String sql = "Select * from dbo.CaLamViec";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<CaLamViecDTO> listCaLamViec = new ArrayList<CaLamViecDTO>();
                while(rs.next()) {
                    CaLamViecDTO caLamViecDTO = new CaLamViecDTO();
                    caLamViecDTO.setMaCa(rs.getString("maCa").trim());
                    caLamViecDTO.setTenCa(rs.getString("tenCa").trim());
                    caLamViecDTO.setThoiGian(rs.getString("thoiGian").trim());
                    listCaLamViec.add(caLamViecDTO);
                }
                return listCaLamViec;
            }
        }
    }

}
