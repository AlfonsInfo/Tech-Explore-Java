package view;

import controller.UserController;;
import model.User;


public class CommanApp {
    private static final UserController userController=  new UserController();
    
    public static void demoCreateUser(){
        User user = new User("alfons", "password");
        userController.createData(user);
    }
    
    public static final void demoLogin(){
        User user = new User("alfons", "password");
        userController.loginUser(user);    
    }
    
    public static final void demoRead(){
        System.out.println("");
        userController.readData();
    }
   
    public static void main(String[] args) {
        //demoCreateUser();
       //demoLogin();
       //demoRead();
    }
    
    
}
