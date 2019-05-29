import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int strong=n;
      int temp=0;
      int sum=0;
      for(int i=n;i>0;i=n){
      	temp=n%10;
        int fact=1;
        for(int j=1;j<=temp;j++){
        	fact=fact*j;
        }
        sum=sum+fact;
        n=i/10;
      }
      if(sum==strong)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}