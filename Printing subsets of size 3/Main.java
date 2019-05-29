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
      for(int j=0;j<n-1;j++){
      	for(int k=j+1;k<n;k++){
        	for(int l=k+1;l<n;l++){
            	System.out.print("("+a[j]+", "+a[k]+", "+a[l]+") ");
            }
        }
        System.out.println();
      }
    }
}