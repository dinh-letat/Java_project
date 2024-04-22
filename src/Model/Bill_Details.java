package Model;

public class Bill_Details {
	private Bill bill;
	private Product product;
	private Integer quantity;
	private Double amountOfMoney;
	
	public Bill_Details(Bill bill, Product product, Integer quantity, Double amountOfMoney) {
		super();
		this.bill = bill;
		this.product = product;
		this.quantity = quantity;
		this.amountOfMoney = amountOfMoney;
	}
	
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getAmountOfMoney() {
		return amountOfMoney;
	}
	public void setAmountOfMoney(Double amountOfMoney) {
		this.amountOfMoney = amountOfMoney;
	}
	
	

}
