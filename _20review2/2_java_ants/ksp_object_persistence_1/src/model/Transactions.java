package model;


public class Transactions {
    private String id;
    private String productId;
    private String userId;
    private Integer stock;
    private Double transactionsAmount;

    public Transactions(String productId, String userId, Integer stock, Double transactionsAmount) {
        this.productId = productId;
        this.userId = userId;
        this.stock = stock;
        this.transactionsAmount = transactionsAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getTransactionsAmount() {
        return transactionsAmount;
    }

    public void setTransactionsAmount(Double transactionsAmount) {
        this.transactionsAmount = transactionsAmount;
    }

    @Override
    public String toString() {
        return "Transactions{" + "id=" + id + ", productId=" + productId + ", userId=" + userId + ", stock=" + stock + ", transactionsAmount=" + transactionsAmount + '}';
    }
    
    
    
    
    
}
