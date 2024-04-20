package database;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://";
        String path = "localhost:3306/";
        String databaseName = "ksp_op";
        String fullPath = jdbcUrl + path + databaseName;
        String username = "root";
        String password = "";
        Connection connection;

        connection =  DriverManager.getConnection(fullPath, username, password);
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO product (name, type, price, stock) VALUES ('produk baru', 'jenis produk', 100.00, 10)";
        statement.execute(sql);
        statement.close();
        connection.close();
    }
}

