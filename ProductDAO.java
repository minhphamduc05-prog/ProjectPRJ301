/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;
import model.Product;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author MinhPD
 */
public class ProductDAO extends DBConnect{
    private final String GET_ALL_PRODUCT="SELECT * FROM [Products]";
    private final String GET_PRODUCT_BY_ID="SELECT * FROM [Products] "
                                +"WHERE productID=?";
    private final String DELETE_PRODUCT_BY_ID="DELETE FROM [dbo].[Products] "
                                +"WHERE productID=?";
    private final String ADD_NEW_PRODUCT="INSERT INTO [dbo].[Products]"
                                +"([productName],[price],[quantity],[image],"
                                +"[description],[catID],[factoryID) \n"
                                +"VALUES(?,?,?,?,?,?,?);";
    private final String UPDATE_PRODUCT="UPDATE [dbo].[Product]\n"
                                +"SET [productName]=? ,[price]=? ,[quantity]=?,"
                                +"[image]=?,[description]=?,[catID]=?,[factoryID]=? \n"
                                +"WHERE productID=?";
    private final String GET_PRODUCTS_BY_CATE="SELECT * FROM [Products] "
                                +"WHERE catID=?";
    public List<Product> getAllProduct(){
        List<Product> list=new ArrayList<>();
        try{
            PreparedStatement st=conn.prepareStatement(GET_ALL_PRODUCT);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p=new Product();
                p.setpID(rs.getInt("productID"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCatID(rs.getInt("catID"));
                p.setPrice(rs.getInt("price"));
                p.setProductName(rs.getString("productName"));
                p.setImage("image");
                p.setDescription("description");
                
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
    public Product getProductByID(int id){
        try{
            PreparedStatement st=conn.prepareStatement(GET_ALL_PRODUCT);
            st.setInt(1,id);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p=new Product();
                p.setpID(rs.getInt("productID"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCatID(rs.getInt("catID"));
                p.setPrice(rs.getInt("price"));
                p.setProductName(rs.getString("productName"));
                p.setImage("image");
                p.setDescription("description");
                
                return p;
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    
    public void deleteProductByID(int id){
        try{
            PreparedStatement st=conn.prepareStatement(DELETE_PRODUCT_BY_ID);
            st.setInt(1,id);
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void addNewProduct(Product product){
        try{
            PreparedStatement st=conn.prepareStatement(ADD_NEW_PRODUCT);
            st.setString(1,product.getProductName());
            st.setDouble(2,product.getPrice());
            st.setInt(3, product.getQuantity());
            st.setString(4, product.getImage());
            st.setString(5,product.getDescription());
            st.setInt(6,product.getCatID());
            st.setInt(7,product.getFactoryID());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void updateProduct(Product product){
        try{
            PreparedStatement st=conn.prepareStatement(UPDATE_PRODUCT);
            st.setString(1,product.getProductName());
            st.setDouble(2,product.getPrice());
            st.setInt(3, product.getQuantity());
            st.setString(4, product.getImage());
            st.setString(5,product.getDescription());
            st.setInt(6,product.getCatID());
            st.setInt(7, product.getFactoryID());
            st.setInt(8,product.getpID());
            st.executeUpdate();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public List<Product> getProductsByCategory(int categoryID){
        List<Product> list=new ArrayList<>();
        try{
            PreparedStatement st=conn.prepareStatement(GET_PRODUCTS_BY_CATE);
            st.setInt(1, categoryID);
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Product p=new Product();
                p.setpID(rs.getInt("productID"));
                p.setQuantity(rs.getInt("quantity"));
                p.setCatID(rs.getInt("catID"));
                p.setPrice(rs.getInt("price"));
                p.setProductName(rs.getString("productName"));
                p.setImage("image");
                p.setDescription("description");
                
                list.add(p);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return list;
    }
    
}
