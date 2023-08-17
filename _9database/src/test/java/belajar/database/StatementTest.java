package belajar.database;

import org.junit.Test;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class StatementTest {

    @Test
    public void testCreateStatement() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        Statement statement = connection.createStatement();
        statement.close();
        connection.close();
    }

    @Test
    public void testExecuteUpdate() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = "INSERT INTO public.products(\n" +
                "\tid, name, description, price, quantity, category)\n" +
                "\tVALUES ('P005','Mie Ayam Favorit' , 'Mantap', 300000, 100, 'Makanan')";
        int change = statement.executeUpdate(sql);

        System.out.println("Jumlah perubahan " + change);

        statement.close();
        connection.close();
    }


    @Test
    public void testExecuteResultSet() throws SQLException{
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        String sql = "SELECT * FROM public.products";

        ResultSet resultSet = statement.executeQuery(sql);

        //Kayak cursor, bisa maju , mundur, dll
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }
}
