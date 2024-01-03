/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ProductDao;

import java.util.List;
import model.Product;
//

/**
 *
 * @author A412DA
 */
public class ProductController {
    
    private final ProductDao productDao = new ProductDao();
    
    public List<Product> readProduct(String searchKey){
        return productDao.readProduct(searchKey);
    }
    
    public void createData(Product  product){
        productDao.createProduct(product);
    }
    
    public void updateData(String id, Product product){
        productDao.updateProduct(id, product);
    }
    
    public Product findByProductId(String id){
        return productDao.findProductById(id);
    }
    
}
