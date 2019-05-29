import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for (int i=0;i<n;i++){
      	a[i]=sc.nextInt();
      }
      int flag=1;
      for(int j=0;j<n/2;j++){
      	if(a[j]!=a[n-1-j]){
        	flag=0;
        }
      }
      if(flag==1){
      	System.out.println("Yes");
      }
      else{
      	System.out.println("No");
      }
    }
}