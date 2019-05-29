import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[100];
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    }
    check_batch(a,n);
  }
  public static void check_batch(int a[],int n){
    int sum=a[0]+a[1]+a[2];
  	for(int i=0;i<n;i=i+3){
    	if((a[i]+a[i+1]+a[i+2])==sum){
        	continue;
        }
      else{
      	System.out.print("Not a Perfect Batch");
        return;
      }
    }
    System.out.print("Perfect Batch");
  }
  
  
}