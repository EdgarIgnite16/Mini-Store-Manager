package DAO;

import DTO.PhieuNhapHangDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PhieuNhapHangDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<PhieuNhapHangDTO> getData() throws Exception {
        String sql = "Select * from dbo.PhieuNhapHang";
        try (
                Connection conn = new _Connection().getConn();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ) {
            try (ResultSet rs = pstm.executeQuery()) {
                ArrayList<PhieuNhapHangDTO> listPhieuNhapHang = new ArrayList<PhieuNhapHangDTO>();
                while (rs.next()) {
                    PhieuNhapHangDTO phieuNhapHangDTO = new PhieuNhapHangDTO();
                    phieuNhapHangDTO.setMaPhieuNhap(rs.getString("maPhieuNhap").trim());
                    phieuNhapHangDTO.setMaNCC(rs.getString("maNCC").trim());
                    phieuNhapHangDTO.setNgayNhap(rs.getString("ngayNhap").trim());
                    listPhieuNhapHang.add(phieuNhapHangDTO);
                }
                return listPhieuNhapHang;
            }
        }
    }
}
