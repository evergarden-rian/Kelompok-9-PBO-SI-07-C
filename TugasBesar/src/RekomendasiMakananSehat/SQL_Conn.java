package RekomendasiMakananSehat;
//@author Rizqi Dwi Saputra

    import java.sql.*;

public class SQL_Conn {
    
    private static final String URL = "jdbc:mysql://localhost:3306/tubes_pbo";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
