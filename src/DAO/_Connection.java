package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class _Connection {
    private String hostname;
    private String portNumber;
    private String username;
    private String password;
    private String dbName;

    private Connection conn;

    public _Connection() {
        checkDriver(); // kiểm tra driver có tồn tại hay không ?
        configValueConnect(); // Cấu hình các giá trị cần thiết để khởi tạo Connect
        setConnection(); // khởi tạo Connection
    }

    // hàm kiểm tra driver
    public void checkDriver() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // tên driver của database sử dụng
            System.out.println("Tìm thấy driver!");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Không tìm thấy driver!\nMsg Error: " + ex.getMessage());
        }
    }

    // hàm cấu hình các thông số database
    public void configValueConnect() {
        this.hostname = "localhost";
        this.portNumber = "1433";
        this.username = "sa";
        this.password = "12345";
        this.dbName = "MiniStore";
    }

    // hàm khởi tạo kết nối
    public void setConnection() {
        try {
            String connectionURL = String.format(
                    "jdbc:sqlserver://%s:%s;databaseName=%s;encrypt=true;trustServerCertificate=true;",
                    hostname, portNumber, dbName);
            this.conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Kết nối database thành công!");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Kết nối database thất bại!\nMsg Error: " + ex.getMessage());
        }
    }

    // lấy Connection
    public Connection getConn() {
        return conn;
    }
}