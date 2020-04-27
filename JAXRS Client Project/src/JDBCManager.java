import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class JDBCManager {

	public static boolean addNewProduct(product p1) 
	{
		
		try 
		{
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cs310?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "poyraz");
			PreparedStatement ps =  con.prepareStatement("insert into product (productName,productPrice,productStock) values (?,?,?)");
			
			ps.setString(1, p1.getproductName());
			ps.setDouble(2, p1.getproductPrice());
			ps.setInt(3, p1.getproductStock());
			int result = ps.executeUpdate();
			
			if(result==1)
			{
				return true;
			}
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	
	
	
	
    public static boolean deleteProduct(Integer id) {

        try {


            Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost/cs310?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "poyraz");

            PreparedStatement preparedStatement =  con2.prepareStatement("delete from product where productID = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            con2.close();

        }

        catch(Exception e){

            System.out.println(e);
            e.printStackTrace();

            return false;

        }

        return true;
    }

	public static boolean updateProductStock(int productID, double productPrice, int productStock) {
		
		try 
		{
			
			Connection con3 = DriverManager.getConnection("jdbc:mysql://localhost/cs310?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "poyraz");
			
			PreparedStatement ps =  con3.prepareStatement("update product set productPrice = ?, productStock = ?   where productID = ?");
			
			
			ps.setDouble(1,productPrice);
			ps.setInt(2,productStock);
			ps.setInt(3, productID);
			
			ps.execute();
			
			return true;
	
	
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}


    

}