package dao;

import connection.DbConnection;
import data.Constant;
import data.UserSession;
import model.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.Helper;

public class UserDao {
    private static final String CREATE_QUERY = "INSERT INTO users (id, username, password) values ( ? , ?, ? )" ;
    private static final String GET_USER_LIST = "SELECT id,username FROM users";
    private static final String UPDATE_BY_ID = "UPDATE users SET username = ? , password = ? Where id = ?";
    private static final String DELETE_USER_BY_ID = "DELETE FROM USERS WHERE id  = ? ";
    private static final String LOGIN_QUERY = "SELECT * FROM users where username = ? and password = ? ";
    
    public void createUser(User user){
        try(PreparedStatement statement = DbConnection.connection.prepareStatement(CREATE_QUERY)){
            DbConnection.makeConnection();
            statement.setString(1, user.getId());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
  
            int result = statement.executeUpdate();
            Helper.printLog(Constant.LogMessage.CREATE_USER_SUCCESS, Helper.getCurrentMethodName(), "RESULT :  "+ result  );
        }catch(SQLException e){
            Helper.printLogError(e.getMessage(), Helper.getCurrentMethodName());
        }finally{
            DbConnection.closeConnection();
        }
    }
    
    public List<User> readUser(){
        String methodName = Helper.getCurrentMethodName();
        List<User> users = new ArrayList<>();
        try{
            DbConnection.makeConnection();
            try (PreparedStatement statement = DbConnection.connection.prepareStatement(GET_USER_LIST); ResultSet resultSet = statement.executeQuery()) {
                while(resultSet.next()){
                    User user = new User();
                    user.setId(resultSet.getString("id"));
                    user.setUsername(resultSet.getString("username"));
                    users.add(user);
                }
               Helper.printLog(Constant.LogMessage.READ_USER, methodName, users.toString());
            }
        }catch(SQLException e){
            Helper.printLogError(e.getMessage(), methodName);
        }finally{
            DbConnection.closeConnection();
        }
        return users;
    }
    
    public boolean loginUser(User user){
        String methodName = Helper.getCurrentMethodName();
         try{
            DbConnection.makeConnection();
            ResultSet resultSet;
            try (PreparedStatement statement = DbConnection.connection.prepareStatement(LOGIN_QUERY)) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());
                resultSet = statement.executeQuery();
                if(resultSet.next()) {
                    User loginUser = new User();
                    loginUser.setId(resultSet.getString("id"));
                    loginUser.setUsername(resultSet.getString("username"));
                    loginUser.setPassword(resultSet.getString("password"));
                    UserSession.setUser(loginUser);
                    resultSet.close();
                    return true;
                }else{
                    resultSet.close();
                    return false;
                }
            }
        }catch(SQLException e){
            Helper.printLogError(e.getMessage(), methodName);
            return false;
        }catch(Exception e){
            Helper.printLogError(e.getMessage(), methodName);
            return false;
        }finally{
            DbConnection.closeConnection();
        }
    }
}
