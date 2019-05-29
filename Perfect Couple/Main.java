import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[100];
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
      }
      int val=sc.nextInt();
      for(int j=0;j<n;j++){
      	for(int k=j+1;k<n;k++){
        	if(a[j]+a[k]==val){
            	System.out.println(a[j]+", "+a[k]);
            }
        }
      }
      
    }
}