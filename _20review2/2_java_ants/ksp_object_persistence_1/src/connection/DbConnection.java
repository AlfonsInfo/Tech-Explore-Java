package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import data.Constant;
import utils.Helper;

public class DbConnection {
    public static Connection connection;
    
    
    public static void makeConnection(){
        String methodName = Helper.getCurrentMethodName();
         Helper.printLog(Constant.LogMessage.OPEN_CONNECTION,methodName, null);
        try{
            //create connection
            connection = DriverManager.getConnection(Constant.Db.FULL_URL, Constant.Db.DB_USERNAME, Constant.Db.DB_PASSWORD);
            
            //Log Success
            Helper.printLog(Constant.LogMessage.OPEN_CONNECTION_SUCCESS, methodName, null);
        }catch(SQLException e){
            //Log Error
            Helper.printLogError(e.getMessage(), methodName);
        }
    }
    
    public static void closeConnection(){
        String methodName = Helper.getCurrentMethodName();
        Helper.printLog(Constant.LogMessage.CLOSE_CONNECTION, methodName, null);
        try{
            connection.close();
            Helper.printLog(Constant.LogMessage.CLOSE_CONNECTION_SUCCESS, methodName, null);
        }catch (SQLException e){
            Helper.printLogError(e.getMessage(),methodName);
        }
    }
}
