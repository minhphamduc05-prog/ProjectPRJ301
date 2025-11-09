/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.security.Timestamp;

/**
 *
 * @author MinhPD
 */
public class Order {
    /*orderId INT IDENTITY(1,1) PRIMARY KEY,
    userId INT,
    orderDate DATETIME DEFAULT GETDATE(),
    total DECIMAL(12,2),
    status NVARCHAR(20) DEFAULT 'Pending', -- Pending, Shipping, Completed, Cancelled
    FOREIGN KEY (userId) REFERENCES Users(userId)*/
    
    private int orderID,userID,total;
    private Timestamp orderDate;
    private boolean status;

    public Order() {
    }

    public Order(int orderID, int userID, int total, Timestamp orderDate, boolean status) {
        this.orderID = orderID;
        this.userID = userID;
        this.total = total;
        this.orderDate = orderDate;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
