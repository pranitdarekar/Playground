import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int last=0;
      int first=0;
      last=n%10;
      while(n>9){
        n=n/10;
      }
      first=n;
      int sum=last+first;
      System.out.println(sum);
      
	}
}