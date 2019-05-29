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
      int key=sc.nextInt();
      for(int j=0;j<n;j++){
        int min=a[j];
        int index=0;
        int temp=0;
      	for(int k=j+1;k<n;k++){
        	if(a[k]<min){
            	min=a[k];
              	index=k;
            }
        }
        temp=a[j];
        a[j]=min;
        a[index]=temp;
      }
      System.out.println(a[n-key]);
    }
  
}