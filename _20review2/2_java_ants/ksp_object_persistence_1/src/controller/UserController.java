package controller;

import dao.UserDao;
import java.util.List;
import model.User;

public class UserController {
    private final UserDao userDao = new UserDao();

    public void createData(User user){
        userDao.createUser(user);
    }
    
    public List<User> readData(){
        return userDao.readUser();
    }
    
    public boolean loginUser(User user){
        return userDao.loginUser(user);
    }

    
}
