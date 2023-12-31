package dao;

import connection.DbConnection;
import data.Constant;
import exception.CustomException;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import utils.Helper;

public class ProductDao {
    private static final String CREATE_QUERY = "INSERT INTO products  ( name, price, stock) values (  ? , ? , ? )";
    private static final String FIND_BY_ID = "SELECT * FROM products where id = ?";
    private static final String READ_AND_SEARCH_QUERY = "SELECT * FROM products WHERE id LIKE ? OR name LIKE ? OR price LIKE ? OR stock LIKE ?";
    private static final String UPDATE_QUERY = "UPDATE  products SET name =  ? , price = ? , stock = ? WHERE id = ?";
    private static final String DELETE_QUERY = "DELETE FROM products WHERE id  = ? ";
    
    private static final String ID_PRODUCT = "id";
    private static final String NAME_PRODUCT = "name";
    private static final String PRICE_PRODUCT = "stock";
    private static final String STOCK_PRODUCT = "price";
    
    
    public void createProduct(Product product){
        DbConnection.makeConnection();
        try(PreparedStatement statement = DbConnection.connection.prepareStatement(CREATE_QUERY)){
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setDouble(3, product.getStock());
  
            int result = statement.executeUpdate();
            Helper.printLog(Constant.LogMessage.CREATE_USER_SUCCESS, Helper.getCurrentMethodName(), "RESULT :  "+ result  );
        }catch(SQLException e){
            Helper.printLogError(e.getMessage(), Helper.getCurrentMethodName());
            throw new CustomException(Constant.ExceptionMessage.SERVER_ERROR);
        }finally{
            DbConnection.closeConnection();
        }
    }
    
    
    public List<Product> readProduct(String searchKey){
        String methodName = Helper.getCurrentMethodName();
        List<Product> products = new ArrayList<>();
        try{
            DbConnection.makeConnection();
            try (PreparedStatement statement = DbConnection.connection.prepareStatement(READ_AND_SEARCH_QUERY)) {
                    statement.setString(1,  "%" + searchKey + "%");
                    statement.setString(2,  "%" + searchKey + "%");
                    statement.setString(3,  "%" + searchKey + "%");
                    statement.setString(4,  "%" + searchKey + "%");
                
                try (ResultSet resultSet = statement.executeQuery()) {
                    while(resultSet.next()){
                        Product product = new Product();
                        product.setId(resultSet.getString("id"));
                        product.setName(resultSet.getString(NAME_PRODUCT));
                        product.setPrice(resultSet.getDouble(PRICE_PRODUCT));
                        product.setStock(resultSet.getInt(STOCK_PRODUCT));
                        products.add(product);
                    }
                }
               Helper.printLog(Constant.LogMessage.READ_USER_SUCCESS, methodName, products.toString());
            }
        }catch(SQLException e){
            Helper.printLogError(e.getMessage(), methodName);
            throw new CustomException(Constant.ExceptionMessage.SERVER_ERROR);
        }finally{
            DbConnection.closeConnection();
        }
        return products;
    }
    
    public void updateProduct(String id, Product product){
          DbConnection.makeConnection();
         try(PreparedStatement statement = DbConnection.connection.prepareStatement(UPDATE_QUERY)){
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getPrice());
            statement.setInt(3, product.getStock());
            statement.setString(4, id);
  
            int result = statement.executeUpdate();
            Helper.printLog(Constant.LogMessage.CREATE_USER_SUCCESS, Helper.getCurrentMethodName(), "RESULT :  "+ result  );
        }catch(SQLException e){
            Helper.printLogError(e.getMessage(), Helper.getCurrentMethodName());
            throw new CustomException(Constant.ExceptionMessage.SERVER_ERROR);// rethrow exception jika ingin di handle juga oleh view layers
        }finally{
            DbConnection.closeConnection();
        }
    }
    
    public void deleteProduct(String id){
        DbConnection.makeConnection();
        try(PreparedStatement statement = DbConnection.connection.prepareStatement(DELETE_QUERY)){
            statement.setString(1, id);
            statement.executeUpdate();
        }catch(SQLException e){
            Helper.printLogError(e.getMessage(), Helper.getCurrentMethodName());
        }finally{
            DbConnection.closeConnection();
        }   
    }
    
    
    public Product findProductById(String id){
        String methodName = Helper.getCurrentMethodName();
        Product product = new Product();
        try{
            DbConnection.makeConnection();
            try (PreparedStatement statement = DbConnection.connection.prepareStatement(FIND_BY_ID)) {
                    statement.setString(1, id );

                
                try (ResultSet resultSet = statement.executeQuery()) {
                    if(Objects.equals(false, resultSet.next())){
                        throw new CustomException("Data tidak ditemukan");
                    }
                        product.setId(resultSet.getString(ID_PRODUCT));
                        product.setName(resultSet.getString(NAME_PRODUCT));
                        product.setPrice(resultSet.getDouble(PRICE_PRODUCT));
                        product.setStock(resultSet.getInt(STOCK_PRODUCT));
                }
               Helper.printLog(Constant.LogMessage.READ_USER_SUCCESS, methodName, product.toString());
            }
        }catch(SQLException e){
            Helper.printLogError(e.getMessage(), methodName);
            throw new CustomException(Constant.ExceptionMessage.SERVER_ERROR);
        }finally{
            DbConnection.closeConnection();
        }
        return product;
    }
}
