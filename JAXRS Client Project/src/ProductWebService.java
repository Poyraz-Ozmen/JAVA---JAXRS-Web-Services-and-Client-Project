import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("ProductWebService")
public class ProductWebService {
	
	@GET
	@Path("addNewProduct/{productName}/{productPrice}/{productStock}")
	public boolean addNewProduct(@PathParam("productName") String productName, @PathParam("productPrice") double productPrice, @PathParam("productStock") int productStock) {
		
		product p = new product(productName,productPrice,productStock);
		boolean result = JDBCManager.addNewProduct(p);
		return result;
	}
	
	
	@GET
	@Path("updateProductStock/{productID}/{productPrice}/{productStock}")
	public boolean updateProductStock(@PathParam("productID") int productID, @PathParam("productPrice") double productPrice, @PathParam("productStock") int productStock) {
		
		
		boolean result = JDBCManager.updateProductStock(productID,productPrice,productStock);
		return result;
	}
	
	
	
	@GET
	@Path("deleteProduct/{productID}")
	public boolean deleteProduct(@PathParam("productID") int productID) {
		
		//product p = new product(productName,productPrice,productStock);
		boolean result = JDBCManager.deleteProduct(productID);
		return result;
	}

}
