/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MinhPD
 */
public class Product {
    /*      productId INT IDENTITY(1,1) PRIMARY KEY,
        productName NVARCHAR(100) NOT NULL,
        price DECIMAL(12,2) NOT NULL,
        quantity INT DEFAULT 0,
        image NVARCHAR(255),            -- ảnh ở đây
        description NVARCHAR(MAX),
        status BIT DEFAULT 1,
        catId INT,
        FOREIGN KEY (catId) REFERENCES Categories(catId))*/
    private int pID,quantity,catID,factoryID;
    private String productName,image,description;
    private double price;

    public Product() {
    }

    public Product(int pID, int quantity, int catID, double price, String productName, String image, String description, int factoryID) {
        this.pID = pID;
        this.quantity = quantity;
        this.catID = catID;
        this.price = price;
        this.productName = productName;
        this.image = image;
        this.description = description;
        this.factoryID=factoryID;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFactoryID() {
        return factoryID;
    }

    public void setFactoryID(int factoryID) {
        this.factoryID = factoryID;
    }
    
    
}
