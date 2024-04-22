package Model;

public class ProductCategory {
	private String productCategoryID;
	private String productCategoryName;
	
	
	public ProductCategory(String productCategoryID, String productCategoryName) {
		super();
		this.productCategoryID = productCategoryID;
		this.productCategoryName = productCategoryName;
	}


	public String getProductCategoryID() {
		return productCategoryID;
	}


	public void setProductCategoryID(String productCategoryID) {
		this.productCategoryID = productCategoryID;
	}


	public String getProductCategoryName() {
		return productCategoryName;
	}


	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	
	

}
