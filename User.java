/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MinhPD
 */
public class User {
    /*CREATE TABLE Users (
    [userid] INT IDENTITY(1,1) PRIMARY KEY,
    [fullname] NVARCHAR(50) NOT NULL,
    [email] NVARCHAR(100) UNIQUE NOT NULL,
    [password] NVARCHAR(255) NOT NULL,
    [phone] NVARCHAR(20),
    [address] NVARCHAR(255),
    [role] NVARCHAR(10) DEFAULT 'customer',  -- admin, customer
);*/
    private int userID;
    private String fullname,email,password,phone,address,role;

    public User() {
    }
    
    public User(String fullname,String email,String phone,String password,String role){
        this.fullname=fullname;
        this.email=email;
        this.phone=phone;
        this.password=password;
        this.role=role;
    }
    public User(int userID, String fullname, String email, String password, String phone, String address, String role) {
        this.userID = userID;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "userID=" + userID + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", phone=" + phone + ", address=" + address + ", role=" + role + '}';
    }

    
    
}
