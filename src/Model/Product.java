package Model;

import java.sql.Date;

public class Product {
	private String productID;
	private String productName;
	private ProductCategory productCategory;
	private Supplier supplier;
	private Double productPrice;
	private Integer productQuantity;
	private Integer stockQuantity;
	private String unit;
	private String productDescription;
	private Date dateImported;
	private Date expirationDate;
	private String productImage;
	public Product(String productID, String productName, ProductCategory productCategory, Supplier supplier,
			Double productPrice, Integer productQuantity, Integer stockQuantity, String unit, String productDescription,
			Date dateImported, Date expirationDate, String productImage) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productCategory = productCategory;
		this.supplier = supplier;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.stockQuantity = stockQuantity;
		this.unit = unit;
		this.productDescription = productDescription;
		this.dateImported = dateImported;
		this.expirationDate = expirationDate;
		this.productImage = productImage;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public ProductCategory getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Integer getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Date getDateImported() {
		return dateImported;
	}
	public void setDateImported(Date dateImported) {
		this.dateImported = dateImported;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	
	
	
	
	
	

}
