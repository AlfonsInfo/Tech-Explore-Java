package belajar.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;

import static belajar.database.Constant.printException;

public class ConnectionPoolTest {

    Logger logger = LoggerFactory.getLogger(ConnectionPoolTest.class);

    @Test
    public void hikariConfiguration()
    {

        logger.debug("Test");
        try{
            HikariConfig config = new HikariConfig();

            config.setDriverClassName("org.postgresql.Driver");
            config.setJdbcUrl(Constant.DatabaseLink.JDBC_URL);
            config.setUsername(Constant.DatabaseLink.USERNAME);
            config.setPassword(Constant.DatabaseLink.PASSWORD);

            //Konfigurasi POOL
            config.setMaximumPoolSize(10); //Maksimum Koneksi
            config.setMinimumIdle(5); // Stand By Minimum koneksi saat koneksi senggang.
            config.setIdleTimeout(60_000); // 60 detik koneksi akan di close
            config.setMaxLifetime(60_000); // Koneksi yang terlalu lama, koneksi ditutup dan rekonek ulang.
            System.out.println("Sukses si tp slf4j pyie cokk");

        }catch (Exception e)
        {
            printException(e);
        }

    }



    @Test
    public void connectionPool()
    {


        try{

            //Representasi connection Pool
            HikariDataSource dataSource = new HikariDataSource(createConfig());
            Connection connection = dataSource.getConnection();

            System.out.println("Mengambil koneksi");

            connection.close();
            System.out.println("sukses mengembalikan koneksi");

            dataSource.close();
            System.out.println("Sukses menutup pool");
        }catch (Exception e)
        {
            printException(e);
        }

    }


    public static HikariConfig createConfig()
    {
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
        return config;
    }
}
