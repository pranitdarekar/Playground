import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner sc=new Scanner(System.in);
      int base=sc.nextInt();
      int exp=sc.nextInt();
      int res=1;
      for(int i=1;i<=exp;i++){
      	res=res*base;
      }
      System.out.println(res);
    }
}