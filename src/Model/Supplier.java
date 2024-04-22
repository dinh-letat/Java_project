package Model;

public class Supplier {
	private String supplierID;
	private String supplierName;
	private String address;
	private String phone;
	private String email;
	public Supplier(String supplierID, String supplierName, String address, String phone, String email) {
		super();
		this.supplierID = supplierID;
		this.supplierName = supplierName;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	public String getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
