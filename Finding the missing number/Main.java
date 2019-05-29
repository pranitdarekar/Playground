import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
      }
      for(int j=1;j<=n;j++){
        int flag=1;
      	for(int k=0;k<n;k++){
        	if(a[k]==j){
            	flag=0;
            }
        }
        if(flag==1){
        	System.out.println(j);
        }
      }
    }
}