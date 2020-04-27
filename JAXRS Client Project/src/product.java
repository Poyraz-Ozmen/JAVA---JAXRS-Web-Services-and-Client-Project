
public class product {
	
	private int productID;
	
	private String productName;
	private double productPrice;
	private int productStock;
	
	
	
	public product() {
		super();
	}
	public product(String productName, double productPrice,int productStock) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		
	}
	
	public int getproductID() {
		return productID;
	}
	public void setproductID(int productID) {
		this.productID = productID;
	}
	
	
	public String getproductName() {
		return productName;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}
	
	
	public double getproductPrice() {
		return productPrice;
	}

	public void setproductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	
	public int getproductStock() {
		return productStock;
	}

	public void setproductStock(int productStock) {
		this.productStock = productStock;
	}
	
}
