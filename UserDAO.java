/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import model.Product;
import model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MinhPD
 */
public class UserDAO extends DBConnect {

    private final String GET_ALL_USER = "SELECT * FROM [Users]";
    private final String GET_USER_BY_ID = "SELECT * FROM [Users] WHERE userID=?";
    private final String DELETE_USER_BY_ID = "DELETE FROM [dbo].[Users] WHERE id = ?";
    private final String ADD_NEW_USER = "INSERT INTO [dbo].[Users]([email],[password],"
            + "[name],[phone],[address],[role])\n"
            + "VALUES(?,?,?,?,?,?);";
    private final String UPDATE_USER = "UPDATE [dbo].[Users] \n"
            + "SET [email]=?,[password]=?,[name]=?"
            + ",[phone]=?,[address]=?,[role]=? \n"
            + "WHERE userID=?";
    private final String UPDATE_PROFILE = "UPDATE [dbo].[Users]\n"
            + "SET [email]=?,[name]=?"
            + ",[phone]=?,[address]=? \n"
            + "WHERE userID=?";
    private final String CHECK_AUTHEN = "SELECT * FROM [Users] WHERE email=? AND "
            + "password=?";
    private final String CHANGE_PASSWORD="UPDATE [dbo].[Users]\n"
                + "   SET [password] = ?\n"
                + " WHERE userID = ?";
    private final String REGISTER_USER="INSERT INTO [dbo].[Users]"
                + "([email],[password],[name],[phone],[role]) \n"
                +"VALUES(?,?,?,?,?)";
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        try {
            PreparedStatement st = conn.prepareStatement(GET_ALL_USER);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                User user = new User();
                user.setUserID(rs.getInt("userId"));
                user.setEmail(rs.getString("email"));
                user.setFullname(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setRole(rs.getString("role"));

                list.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public User getUserByID(int id) {

        try {
            PreparedStatement st = conn.prepareStatement(GET_USER_BY_ID);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUserID(rs.getInt("userId"));
                user.setEmail(rs.getString("email"));
                user.setFullname(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setRole(rs.getString("role"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public void deleteUserByID(int id) {
        try {
            PreparedStatement st = conn.prepareStatement(DELETE_USER_BY_ID);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            int rowsAffected = st.executeUpdate();
            System.out.println("Delete " + rowsAffected + " user(s).");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addNewUser(User user) {
        try {
            PreparedStatement st = conn.prepareStatement(ADD_NEW_USER);
            st.setString(1, user.getEmail());
            st.setString(2, user.getPassword());
            st.setString(3, user.getFullname());
            st.setString(4, user.getPhone());
            st.setString(5, user.getAddress());
            st.setString(6, user.getRole());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public void registNewUser(User user){
        try{
            PreparedStatement st=conn.prepareStatement(REGISTER_USER);
            st.setString(1, user.getEmail());
            st.setString(2,user.getPassword());
            st.setString(3,user.getFullname());
            st.setString(4, user.getPhone());
            st.setString(5,user.getRole());
            
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void updateUser(User user) {
        try {
            PreparedStatement st = conn.prepareStatement(UPDATE_USER);
            st.setString(1, user.getEmail());
            st.setString(2, user.getPassword());
            st.setString(3, user.getFullname());
            st.setString(4, user.getPhone());
            st.setString(5, user.getAddress());
            st.setString(6, user.getRole());
            st.setInt(7, user.getUserID());
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateProfile(User user) {
        try {
            PreparedStatement st = conn.prepareStatement(UPDATE_PROFILE);
            st.setString(1, user.getEmail());
            st.setString(2, user.getFullname());
            st.setString(3, user.getPhone());
            st.setString(4, user.getAddress());
            st.setInt(5, user.getUserID());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public User checkAuthen(String email, String password) {
        try {
            PreparedStatement st = conn.prepareStatement(CHECK_AUTHEN);
            st.setString(1, email);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                //User(int userID, String name, String email,
                //String password, String phone, String address, String role)
                return new User(rs.getInt("userID"),
                        rs.getString("name"),
                        email,
                        password,
                        rs.getString("phone"),
                        rs.getString("address"),
                        rs.getString("role"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public void changePassword(int userId, String newPassword) {
        try {
            PreparedStatement st = conn.prepareStatement(CHANGE_PASSWORD);
            st.setString(1, newPassword);
            st.setInt(2, userId);
            
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        UserDAO users=new UserDAO();
        User user=users.checkAuthen("minhpd123@gmail.com", "123456");
        System.out.println(user);
    }

}

