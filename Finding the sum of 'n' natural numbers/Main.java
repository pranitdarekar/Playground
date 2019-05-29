import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=sum(n);
      System.out.println(a);
    }
  public static int sum(int n){
  	if(n==0){
    	return 0;
    }
    else {
    	return n+sum(n-1);
    }
  }
}