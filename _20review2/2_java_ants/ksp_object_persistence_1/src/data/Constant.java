package data;


public class Constant {
    //Menyimpan data-data konstan secara terpusat
    
    //Konstan untuk Database 
    //Tujuan konstan : menghindari Typing mistakes (Kesalahan seperti ini terkadang lebih susah untuk didebug karena tidak terprediksi)
    public  static class Db{
        
        public static final String DB_URL = "jdbc:mysql://";
        public static final String PATH = "localhost:3306/";
        public static final String DATABASE_NAME = "ksp_object_persistence";
        
        public static final String DB_USERNAME = "root";
        public static final String DB_PASSWORD = "";
        
        
        public static final String FULL_URL = DB_URL + PATH+ DATABASE_NAME ;
    }
    
    public static class LogMessage{
        
        //MODEL CONTEXT
        public static final String USER = " USER ";
        public static final String PRODUCT = " PRODUCT ";
        
        public static final String SUCCESS = "SUCCESS ";
        public static final String SPACES = " ";
        public static final String OPEN_CONNECTION = "OPEN DATABASE CONNECTION";
        public static final String CLOSE_CONNECTION = "CLOSE DATABASE CONNECTION";
        public static final String OPEN_CONNECTION_SUCCESS = SUCCESS + OPEN_CONNECTION;
        public static final String CLOSE_CONNECTION_SUCCESS =SUCCESS + CLOSE_CONNECTION;
        

        public static final String LOGIN = "LOGIN ";
        public static final String SUCCESS_LOGIN = LOGIN +  SUCCESS;
        
        public static final String CREATE = " CREATE ";
        public static final String UPDATE = " UPDATE ";
        public static final String READ = " READ ";
        public static final String DELETE = " DELETE";
        
        
        //USER 
        
        public static final String CREATE_USER = CREATE + USER;
        public static final String UPDATE_USER = UPDATE + USER;
        public static final String READ_USER = READ + USER;
        public static final String DELETE_USER = DELETE + USER; 
        
        
        public static final String CREATE_USER_SUCCESS = CREATE_USER + SUCCESS;
        public static final String UPDATE_USER_SUCCESS = UPDATE_USER + SUCCESS;
        public static final String READ_USER_SUCCESS = READ_USER + SUCCESS;
        public static final String DELETE_USER_SUCCESS =DELETE_USER+ SUCCESS;
        
        
        //PRODUCT 
    
        public static final String CREATE_PRODUCT = CREATE + PRODUCT;
        public static final String UPDATE_PRODUCT = UPDATE + PRODUCT;
        public static final String READ_PRODUCT = READ + PRODUCT;
        public static final String DELETE_PRODUCT = DELETE + PRODUCT; 
        
        
        public static final String CREATE_PRODUCT_SUCCESS = CREATE_PRODUCT + SUCCESS;
        public static final String UPDATE_PRODUCT_SUCCESS = UPDATE_PRODUCT + SUCCESS;
        public static final String READ_PRODUCT_SUCCESS = READ_PRODUCT + SUCCESS;
        public static final String DELETE_PRODUCT_SUCCESS =DELETE_PRODUCT+ SUCCESS;
        
        
        
    }
    
    
}
