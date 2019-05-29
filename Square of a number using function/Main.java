import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int square=find_square(n);
      System.out.println(square);
	} 
  public static int find_square(int n){
  	int sq=n*n;
    return sq;
  }
}