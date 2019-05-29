import java.util.Scanner;
class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      	int base=sc.nextInt();
      	int exp=sc.nextInt();
      	int pow=power(base,exp);
      System.out.println(pow);
    }
  public static int power(int base,int exp){
  	int pow=1;
    if(exp==0){
    	return 1;
    }
    for(int i=1;i<=exp;i++){
    	pow=base*pow;
    }
    return pow;
  }
}