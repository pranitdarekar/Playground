import java.util.Scanner;
class Item
{
   int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
   
}
   
class Customer
{
   String product;
   int quantity;
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}

class Bill
{
  public void getBill(Customer c,Item i){
  int cost=i.getPrice();
  int q=c.getQuantity();
  System.out.println("Total Price is : "+(cost*q));
  }
}
public class Main
{
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	String prod=sc.nextLine();
	int pric=sc.nextInt();
	int quant=sc.nextInt();
    Customer c = new Customer();
    Item i = new Item();
    Bill obj = new Bill();
    
    c.setProduct(prod);
    c.setQuantity(quant);
    i.setPrice(pric);
    
    obj.getBill(c, i);
    
  }
}