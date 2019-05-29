import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1;
      for(int i=1;i<=n;i++){
      	for(int j=1;j<=i;j++){
        	if(count%2==1)
            {   System.out.print("*");
             count++;
            }
          	else{
              System.out.print("#");
              count++;
            }
        }
        System.out.println();
      }
    }
}