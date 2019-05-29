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
    max_index(a,n);
  }
  public static void max_index(int a[],int n){
  	int max=0;
    int index=0;
    for(int i=0;i<n;i++){
    	if(a[i]>=max){
        	max=a[i];
          	index=i;
        }
    }
    System.out.print(index);
  }
}