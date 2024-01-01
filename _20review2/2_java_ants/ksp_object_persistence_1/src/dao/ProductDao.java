package dao;

import connection.DbConnection;
import data.Constant;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.CommonHelper;

public class ProductDao {
    private static final String CREATE_QUERY = "INSERT INTO products  ( name, price, stock) values (  ? , ? , ? )";
    private static final String READ_QUERY = "SELECT * FROM products";
    private static final String READ_AND_SEARCH_QUERY = "SELECT * From products where id LIKE %?% or name LIKE %?% or price LIKE %?% or stock %?%";
    private static final String UPDATE_QUERY = "UPDATE INTO products SET column";
    private static final String DELETE_QUERY = "DELETE FROM products WHERE id  = ? ";
    
    
    public void createProduct(Product product){
        try(PreparedStatement statement = DbConnection.connection.prepareStatement(CREATE_QUERY)){
            DbConnection.makeConnection();
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setDouble(3, product.getStock());
  
            int result = statement.executeUpdate();
            CommonHelper.printLog(Constant.LogMessage.CREATE_USER_SUCCESS, CommonHelper.getCurrentMethodName(), "RESULT :  "+ result  );
        }catch(SQLException e){
            CommonHelper.printLogError(e.getMessage(), CommonHelper.getCurrentMethodName());
        }finally{
            DbConnection.closeConnection();
        }
    }
    
    
    public List<Product> readProduct(String searchKey){
             String methodName = CommonHelper.getCurrentMethodName();
        List<Product> products = new ArrayList<>();
        try{
            DbConnection.makeConnection();
            try (PreparedStatement statement = DbConnection.connection.prepareStatement(READ_AND_SEARCH_QUERY); ResultSet resultSet = statement.executeQuery()) {
                while(resultSet.next()){
                    Product product = new Product();
                    product.setId(resultSet.getString("id"));
                    product.setName(resultSet.getString("name"));
                    product.setPrice(resultSet.getDouble("name"));
                    product.setStock(resultSet.getInt("stock"));
                    products.add(product);
                }
               CommonHelper.printLog(Constant.LogMessage.READ_USER, methodName, products.toString());
            }
        }catch(SQLException e){
            CommonHelper.printLogError(e.getMessage(), methodName);
        }finally{
            DbConnection.closeConnection();
        }
        return products;
    }
    
    public void updateProduct(String id, Product product){
        
    }
    
    public void deleteProduct(String id){
        
    }
}
