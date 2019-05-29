public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
		Customers customerObj1=new Customers(1001,"Saakshi","9000000000","Bangalore","16-Jul-1970","F","Lakme Kajal,Salwar");
		Customers customerObj2=new Customers(1008,"Rahul","9000000001","Chennai","27-Jan-1992","M","T-Shirt,Jeans");
		Suppliers supplierObj1=new Suppliers(7901,"ABC Traders","8000000000","Mumbai",10,"Paid",4.75);
		Suppliers supplierObj2=new Suppliers(7972,"XYZ Enterprises","8000000900","Kolkata",7,"Unpaid",4.35);
		
		customerObj1.displayProfileDetails(customerObj1);
		customerObj2.displayProfileDetails(customerObj2);
		supplierObj1.displayProfileDetails(supplierObj1);
		supplierObj2.displayProfileDetails(supplierObj2);
		
		customerObj1.editAddress(customerObj1);
		supplierObj1.editAddress(supplierObj1);
		
		customerObj1.placeOrder();
		
		supplierObj1.increaseStockLevel(supplierObj1,5);
		supplierObj2.increaseStockLevel(supplierObj2,10);
    }	
}

class Users {
		//write the logic for the class Users
	String name;
	String mobileNumber;
	
}

class Customers extends Users{
		//write the logic for the class Customers	
	int customerId;
	String shippingAddress;
	String dateOfBirth;
	String gender;
	String orderHistory;
	
	public Customers(int id,String name,String mob,String shipAdd,String dob,String gen,String ordHis) {
		this.customerId=id;
		super.name=name;
		super.mobileNumber=mob;
		this.shippingAddress=shipAdd;
		this.dateOfBirth=dob;
		this.gender=gen;
		this.orderHistory=ordHis;
	}
	
	public void editAddress(Customers obj) {
		System.out.println(obj.name + ", "+obj.shippingAddress);
		System.out.println(obj.name + ", Coimbatore");
		
	}
	public void placeOrder() {
		System.out.println("Order placed successfully!");
		
	}
	public void displayProfileDetails(Users object) {
		System.out.println(object.name + ", "+ Long.parseLong(object.mobileNumber));
	}
	
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
	int supplierId;
	String billingAddress;
	int itemsStock;
	String paymentStatus;
	double feedbackRating;
	
	public Suppliers(int id,String name,String mob,String billAdd,int itemStk,String paymentSt,double feedbackRat) {
		this.supplierId=id;
		super.name=name;
		super.mobileNumber=mob;
		this.billingAddress=billAdd;
		this.itemsStock=itemStk;
		this.paymentStatus=paymentSt;
		this.feedbackRating=feedbackRat;
	}
	
	public void editAddress(Suppliers obj) {
		System.out.println(obj.name + ", "+obj.billingAddress);
		System.out.println(obj.name + ", Delhi");
		
	}
	public void increaseStockLevel(Suppliers obj,int n) {
		obj.itemsStock=obj.itemsStock+n;
		System.out.println(obj.name+ ", "+obj.itemsStock);
		
	}
	public void displayProfileDetails(Users object) {
		System.out.println(object.name + ", "+ Long.parseLong(object.mobileNumber));
	}
}