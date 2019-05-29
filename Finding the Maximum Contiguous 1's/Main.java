import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
      }
      int max=0;
      for(int j=0;j<n;j++){
      	int count=0;
        int index=j;
        //int max=0;
        while(index<n && a[index]==1){
        	count++;
          	index++;
        }
        if(count>max){
        	max=count;
        }
        j=j+count;
      }
      System.out.println(max);
    }
}