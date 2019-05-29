import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    }
    for(int j=0;j<n;j++){
    	for(int k=j+1;k<n;k++){
        	if(a[k]>a[j]){
            	System.out.println(a[j]+","+a[k]);
            }
        }
    }
  }
}