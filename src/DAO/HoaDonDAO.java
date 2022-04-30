package DAO;

import DTO.HoaDonDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class HoaDonDAO {

    // hàm lấy dữ liệu từ database
    public ArrayList<HoaDonDTO> getData() throws Exception {
        String sql = "Select * from dbo.HoaDon";
        try (
                Connection conn = new _Connection().getConn();
                Statement stm = conn.createStatement()
        ) {
            try (ResultSet rs = stm.executeQuery(sql)) {
                ArrayList<HoaDonDTO> listHoaDon = new ArrayList<HoaDonDTO>();
                while (rs.next()) {
                    HoaDonDTO hoaDonDTO = new HoaDonDTO();
                    hoaDonDTO.setMaHD(rs.getString("maHD").trim());
                    hoaDonDTO.setMaNV(rs.getString("maNV").trim());
                    hoaDonDTO.setMaKH(rs.getString("maKH").trim());
                    hoaDonDTO.setMaGiamGia(rs.getString("maGiamGia").trim());
                    hoaDonDTO.setNgayBan(rs.getString("ngayBan").trim());
                    hoaDonDTO.setTongHoaDon(rs.getFloat("tongHoaDon"));
                    listHoaDon.add(hoaDonDTO);
                }
                return listHoaDon;
            }
        }
    }

    // hàm insert dữ liệu lên database
    public boolean insertItem(HoaDonDTO hoaDonDTO) throws Exception {
        String sql = "INSERT INTO [dbo].[HoaDon] ([maHD] ,[maNV] ,[maKH] ,[maGiamGia] ,[tongHoaDon] ,[ngayBan])" +
                " VALUES(?, ?, ?, ?, ?, ?)";

        // sử dụng try with resource
        try (Connection conn = new _Connection().getConn()) {
            conn.setAutoCommit(false);
            try (PreparedStatement pstm = conn.prepareStatement(sql)) {
                pstm.setString(1, hoaDonDTO.getMaHD());
                pstm.setString(2, hoaDonDTO.getMaNV());
                pstm.setString(3, hoaDonDTO.getMaKH());
                pstm.setString(4, hoaDonDTO.getMaGiamGia());
                pstm.setFloat(5, hoaDonDTO.getTongHoaDon());
                pstm.setString(6, hoaDonDTO.getNgayBan());

                boolean checkPSTM = pstm.executeUpdate() > 0;
                conn.commit(); // commit thay đổi lên database
                conn.setAutoCommit(true); // set AutoCommit lại thành true

                // nếu executeUpdate trả về hơn 1 => query thành công
                // ngược lại => query thất bại
                return checkPSTM;
            } catch (Exception ex) {
                conn.rollback(); // transactions roll back nếu sql thực thi thất bại
            }
        }
        return false;
    }
}
