package belajar.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionUtil {

    private static HikariDataSource dataSource;
    static{
        HikariConfig config = new HikariConfig();

        config.setDriverClassName("org.postgresql.Driver");
        config.setJdbcUrl(Constant.DatabaseLink.JDBC_URL);
        config.setUsername(Constant.DatabaseLink.USERNAME);
        config.setPassword(Constant.DatabaseLink.PASSWORD);

        //Konfigurasi POOL
        config.setMaximumPoolSize(10); //Maksimum Koneksi
        config.setMinimumIdle(5); // Stand By Minimum koneksi saat koneksi senggang.
        config.setIdleTimeout(60_000); // 60 detik koneksi akan di close
        config.setMaxLifetime(60_000); // Koneksi ya

        dataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getDataSource()
    {
        return dataSource;
    }
}
