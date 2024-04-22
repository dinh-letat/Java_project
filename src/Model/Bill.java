package Model;

import java.sql.Date;

public class Bill {
	private String billID;
	private Date ngay;
	private Employee employee;
	private Customer customer;
	private Double total;
	
	public Bill(String billID, Date ngay, Employee employee, Customer customer, Double total) {
		super();
		this.billID = billID;
		this.ngay = ngay;
		this.employee = employee;
		this.customer = customer;
		this.total = total;
	}
	public String getBillID() {
		return billID;
	}
	public void setBillID(String billID) {
		this.billID = billID;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	

}
