package academy.devdojo.maratonajava.javacore.ZZIjdbc.conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //java.sql = Connection, Statement, ResultSet, DriverManager
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store_db";
        String username = "root";
        String password = "admin";
        return DriverManager.getConnection(url, username, password);
    }
}
