package car_dealership;

public class Vehicle {
    private String make;
    private String model;
    private double price;//noone will able to access these variables directly outside of this class.
	
    public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + "]";
	}//to print the object(vehicle) when finance=false we will use toString method or else it will give output hashcode
	
}
