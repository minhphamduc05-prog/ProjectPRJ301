/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MinhPD
 */
public class OrderDetails {
/*detailId INT IDENTITY(1,1) PRIMARY KEY,
orderId INT,
productId INT,
price DECIMAL(12,2),
quantity INT,
FOREIGN KEY (orderId) REFERENCES Orders(orderId),
FOREIGN KEY (productId) REFERENCES Products(productId)*/
    
    private int detailID,orderID,productID,price,quantity;

    public OrderDetails() {
    }

    public OrderDetails(int detailID, int orderID, int productID, int price, int quantity) {
        this.detailID = detailID;
        this.orderID = orderID;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    public int getDetailID() {
        return detailID;
    }

    public void setDetailID(int detailID) {
        this.detailID = detailID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
