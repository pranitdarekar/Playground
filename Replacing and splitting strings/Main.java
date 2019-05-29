import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int n=sc.nextInt();
      str1=str2;
      int len=str1.length();
      //System.out.println(str2);
      int idx=0;
      for(int i=1;i<=n;i++){
      	while(idx <len && str1.charAt(idx) !=' '){
        	System.out.print(str1.charAt(idx));
          //System.out.print(idx);
          	idx++;
        }
        System.out.println();
        idx++;
      }
    }
}