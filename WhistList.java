/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MinhPD
 */
public class WhistList {
    /*wishId INT IDENTITY(1,1) PRIMARY KEY,
userId INT,
productId INT,
addedDate DATETIME DEFAULT GETDATE(),
FOREIGN KEY (userId) REFERENCES Users(userId),
FOREIGN KEY (productId) REFERENCES Products(productId)*/
    
    private int wishID,userID,productID;

    public WhistList() {
    }

    public WhistList(int wishID, int userID, int productID) {
        this.wishID = wishID;
        this.userID = userID;
        this.productID = productID;
    }

    public int getWishID() {
        return wishID;
    }

    public void setWishID(int wishID) {
        this.wishID = wishID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    
}
