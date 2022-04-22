package DAO;

import DTO.NhanVienDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NhanVienDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<NhanVienDTO> getData() throws Exception {
        String sql = "Select * from dbo.NhanVien";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<NhanVienDTO> listNhanVien = new ArrayList<NhanVienDTO>();
                while(rs.next()) {
                    NhanVienDTO nhanVienDTO = new NhanVienDTO();
                    nhanVienDTO.setMaNV(rs.getString("maNV").trim());
                    nhanVienDTO.setMaCV(rs.getString("maCV").trim());
                    nhanVienDTO.setMaCa(rs.getString("maCa").trim());
                    nhanVienDTO.setTenNV(rs.getString("tenNV").trim());
                    nhanVienDTO.setCmnd(rs.getString("cmnd").trim());
                    nhanVienDTO.setSdt(rs.getString("sdt").trim());
                    listNhanVien.add(nhanVienDTO);
                }
                return listNhanVien;
            }
        }
    }
}
