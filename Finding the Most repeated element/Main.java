import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    }
    int index=0;
    int max=0;
    for(int j=0;j<n;j++){
    	int count=0;
      	for(int k=j+1;k<n;k++){
        	if(a[j]==a[k]){
            	count++;
            }
        }
      if(count>max){
      	max=count;
        index=j;
      }
      	
    }
    System.out.println(a[index]);
  }
}