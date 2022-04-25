package DAO;

import DTO.NhaCungCapDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class NhaCungCapDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<NhaCungCapDTO> getData() throws Exception {
        String sql = "Select * from dbo.NhaCungCap";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<NhaCungCapDTO> listNhaCungCap = new ArrayList<NhaCungCapDTO>();
                while (rs.next()) {
                    NhaCungCapDTO nhaCungCapDTO = new NhaCungCapDTO();
                    nhaCungCapDTO.setMaNCC(rs.getString("maNCC").trim());
                    nhaCungCapDTO.setTenNCC(rs.getString("tenNCC").trim());
                    nhaCungCapDTO.setSDT(rs.getString("SDT").trim());
                    listNhaCungCap.add(nhaCungCapDTO);
                }
                return listNhaCungCap;
            }
        }
    }
}
