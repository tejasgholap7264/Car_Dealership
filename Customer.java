package car_dealership;

public class Customer {
    private String name;
    private String address;
    private double cashOnHand;
    private double creditScore;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	public double getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(double creditScore) {
		this.creditScore=creditScore;
	}
	
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
	    emp.handleCustomer(this, finance, vehicle);	
	}
    
    
}
