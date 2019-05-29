import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int gcd1=gcd(n1,n2);
      int gcd=gcd(gcd1,n3);
      System.out.println(gcd);
	}
  public static int gcd(int n1,int n2){
  	if(n1<n2){
    	for(int i=n1;i>=1;i--){
          if(n1%i==0 && n2%i==0){
            return i;
          }
        }
    }
    else{
    	for(int i=n2;i>=1;i--){
          if(n1%i==0 && n2%i==0){
            return i;
          }
        }
    }
    return 0;
  }
  
}