import java.sql.*;

public class JBDCexample {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/heheh";
    static final String USER = "root";
    static final String PASS = "123456789";

    public static void main(String[] args) {

        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            // TODO: handle exception
            System.out.println("Driver not found");
        }
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER,
                    "123456789");
            System.out.println("Connection Successfully");
            Statement st = conn.createStatement();
            boolean checkCode = st.execute("INSERT INTO Sanpham VALUES ('NVS', 'NVSUE',  2000, 'MVSUEIU')");
            ResultSet rs = st.executeQuery("SELECT * FROM Sanpham");
            while (rs.next()) {
                System.out.println(rs.getString("MaSp"));
            }
            conn.close();
        } catch (SQLException e) {
            // TODO: handle exception
            System.out.println("Connection Failed");
        }
    }
}
