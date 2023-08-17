package belajar.database;

import com.zaxxer.hikari.HikariConfig;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

import static belajar.database.Constant.printException;


public class DatabaseTest {


    @Test
    public void testDriver()
    {
        try{
            Driver postgreDriver = new Driver();
            DriverManager.registerDriver(postgreDriver);
        } catch (Exception e)
        {
            printException(e);
        }
    }

    @Test
    public void testConnection()
    {
        try{
            Connection connection = DriverManager.getConnection(Constant.DatabaseLink.JDBC_URL,
                    Constant.DatabaseLink.USERNAME,
                    Constant.DatabaseLink.PASSWORD
            );
            System.out.println("Sukses Membuat Koneksi");
        }catch (Exception e)
        {
            printException(e);
        }
    }

    @Test
    public void testCloseConnection()
    {
        try{

            Connection connection = DriverManager.getConnection(Constant.DatabaseLink.JDBC_URL,
                    Constant.DatabaseLink.USERNAME,
                    Constant.DatabaseLink.PASSWORD
                    );
            System.out.println("Membuka Koneksi");
            connection.close();
            System.out.println("Tutup koneksi");
        } catch (Exception e)
        {
            printException(e);
        }
    }

}

