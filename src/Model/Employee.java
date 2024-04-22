package Model;

import java.time.LocalDate;

public class Employee {
	private String employeeID;
	private String employeeName;
	private String employeePosition;
	private LocalDate employeeBirthdate;
	private Account account;
	private Product product;
	private Bill bill;
	
	public Employee(String employeeID, String employeeName, String employeePosition, LocalDate employeeBirthdate,
			Account account, Product product, Bill bill) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.employeeBirthdate = employeeBirthdate;
		this.account = account;
		this.product = product;
		this.bill = bill;
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePosition() {
		return employeePosition;
	}
	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}
	public LocalDate getEmployeeBirthdate() {
		return employeeBirthdate;
	}
	public void setEmployeeBirthdate(LocalDate employeeBirthdate) {
		this.employeeBirthdate = employeeBirthdate;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	

}
