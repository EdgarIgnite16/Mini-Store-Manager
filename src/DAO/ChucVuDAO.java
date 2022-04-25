package DAO;

import DTO.ChucVuDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ChucVuDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<ChucVuDTO> getData() throws Exception {
        String sql = "Select * from dbo.ChucVu";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<ChucVuDTO> listChucVu = new ArrayList<ChucVuDTO>();
                while (rs.next()) {
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
