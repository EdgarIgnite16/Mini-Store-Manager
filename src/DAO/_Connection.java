package DAO;
import java.sql.*;

public class _Connection {
    private String hostname ;
    private String portNumber ;
    private String username ;
    private String password;
    private String dbName;

    private Connection conn;
    private Statement stm;
    private PreparedStatement pstm;
    private ResultSet rs;

    public _Connection() {
        checkDriver(); // kiểm tra driver có tồn tại hay không ?
        configValueConnect(); // Cấu hình các giá trị cần thiết để khởi tạo Connect
        setConnection(); // khởi tạo Connection
    }

    // hàm kiểm tra driver
    public void checkDriver() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // tên driver của database sử dụng
            System.out.println("Tim thay driver !");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("khong tim thay driver !");
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
    public void setConnection(){
        try {
            String connectionURL = String.format(
                    "jdbc:sqlserver://%s:%s;databaseName=%s;encrypt=true;trustServerCertificate=true;",
                    hostname, portNumber, dbName);
            this.conn = DriverManager.getConnection(connectionURL, username, password);
            System.out.println("Ket noi database thanh cong !");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Ket noi database that bai !");
        }
    }

    // hàm đóng các connection, statement và preparedStatement
    public void closeConnection() {
        try {
            if(conn != null) {
                conn.close();
            }
            if(stm != null) {
                stm.close();
            }
            if(pstm != null) {
                pstm.close();
            }
            System.out.println("Dong connection thanh cong !");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Dong connection that bai !");
        }
    }

    public Connection getConn() {
        return conn;
    }
}