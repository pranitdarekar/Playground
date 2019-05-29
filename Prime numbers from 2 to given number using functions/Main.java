import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int flag=1;
      for(int i=2;i<=n;i++){
      	flag=prime(i);
        if(flag==0){
        System.out.println(i);
        }
      }
	}
  public static int prime(int n){	
    int flag=0;
    for(int i=2;i<n;i++){
    	if((n%i)==0){
        	flag=1;
        }
    }    
    return flag;
  }
}