package DAO;

import DTO.CaLamViecDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CaLamViecDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<CaLamViecDTO> getData() throws Exception {
        String sql = "Select * from dbo.CaLamViec";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<CaLamViecDTO> listCaLamViec = new ArrayList<CaLamViecDTO>();
                while (rs.next()) {
                    CaLamViecDTO caLamViecDTO = new CaLamViecDTO();
                    caLamViecDTO.setMaCa(rs.getString("maCa").trim());
                    caLamViecDTO.setTenCa(rs.getString("tenCa").trim());
                    caLamViecDTO.setKhungGio(rs.getString("khungGio").trim());
                    listCaLamViec.add(caLamViecDTO);
                }
                return listCaLamViec;
            }
        }
    }

}
