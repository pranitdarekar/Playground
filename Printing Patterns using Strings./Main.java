import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder s1=new StringBuilder(s);
    int n=s1.length();
    for(int i=0;i<n;i++){
    	for(int j=i+1;j<n;j++){
        	System.out.print(" ");
        }
      	int idx=(n-1)/2;
      	for(int k=0;k<i+1;k++){
          	if(idx<n){
        	System.out.print(s1.charAt(idx));
            }
          	else if(idx==n){
            idx=0;
            System.out.print(s1.charAt(idx));
            }
          	idx++;
        }
      System.out.println();
    }
  }
}