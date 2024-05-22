package car_dealership;

/* 
 Write a program to simulate a car dealership sales process
 We will have employees,working selling vehivles to customers.
*/

public class Dealership {
    public static void main(String[] args) {
    	Customer cust1=new Customer(); //cust1 is var of type Customer
    	cust1.setName("Tejas");
    	cust1.setAddress("Pune");
    	cust1.setCashOnHand(120000);
    	cust1.setCreditScore(760);
    	
    	Vehicle vehicle= new Vehicle();
    	vehicle.setMake("Honda");
    	vehicle.setModel("Accord");
    	vehicle.setPrice(10000);
    	
    	Employee emp=new Employee();
    	
    	cust1.purchaseCar(vehicle, emp, false);
    	//vehicle which is interested in
    	//emp that chooses to get help from
    	
    	
    	/*
    	 * handleCustomer(Customer cust,boolean finance, Vehicle vehicle)
    	 * if(finance==true){
    	 *     runCreditHistory(Customer cust,double doubleAmount)
    	 * else if(vehicle.getPrice<=cust.getCashOnHand())
    	 *     processTransaction(Customer cust, Vehicle vehicle)
    	 * else
    	 *     tell customer to bring money
	    */
    }
}
