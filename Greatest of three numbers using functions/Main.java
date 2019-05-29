import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int n3=sc.nextInt();
      int sl=0;
      sl=sec(n1,n2);
      int lar=largest(sl,n3);
      System.out.println(lar);
	}
  public static int sec(int n1,int n2){
  	if(n1>n2){
    	return n1;
    }
    else
      return n2;
  }
  public static int largest(int s1,int n3){
  	if(s1>n3){
    	return s1;
    }
    else 
      return n3;
  }
}