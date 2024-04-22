package Model;

public class Customer {
	private String customerID;
	private String customerName;
	private String customerPhone;
	private String email;
	private String address;
	private Integer point;
	public Customer(String customerID, String customerName, String customerPhone, String email, String address,
			Integer point) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.email = email;
		this.address = address;
		this.point = point;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	

}
