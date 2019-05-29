import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=factorial(n);
    System.out.println(a);
  }
  public static int factorial(int n){
  	if(n==0){
    	return 1;
    }
    else{
    	return n*factorial(n-1);
    }
  }
}