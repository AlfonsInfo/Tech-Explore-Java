package belajar.database;

import org.junit.Test;

import java.sql.*;

public class SQLInjection {

    @Test
    public void testExecuteResultSet() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        Statement statement = connection.createStatement();

        //Anggap ini inputan user
        String username = "adit'; -- "; //Akibatnya setelah adit'; dicomment
        String password = "password";

        String sql = "SELECT * FROM public.users where first_name = '" +
                username + "' And password = '" + password + "'";

        System.out.println(sql);
        ResultSet resultSet = statement.executeQuery(sql);

        //Kayak cursor, bisa maju , mundur, dll
        if(resultSet.next()){
            System.out.println(resultSet.getString("first_name"));
            System.out.println("Berhasil login");
        }else{
            System.out.println("username ato password salah");
        }
    }

    //Solusi PreparedStatement & Input user diganti dengan tanda tanya untuk target eksekusi
    @Test
    public void testSolution() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();


        //Anggap ini inputan user
        String username = "adit'; -- "; //Akibatnya setelah adit'; dicomment
        String password = "password";

        String sql = "SELECT * FROM public.users where first_name = ? AND password = ? ";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,username);
        statement.setString(2,password);

        ResultSet resultSet = statement.executeQuery();
        //Kayak cursor, bisa maju , mundur, dll
        if(resultSet.next()){
            System.out.println(resultSet.getString("first_name"));
            System.out.println("Berhasil login");
        }else{
            System.out.println("username ato password salah");
        }
    }

}
