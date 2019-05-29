import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder s1=new StringBuilder(s);
    StringBuilder s2=new StringBuilder();
    int n=s1.length();
    for(int i=0;i<n;i++)
    {
    	if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u')
        {
        }
      	else
        {
        	char ch=s1.charAt(i);
          	s2=s2.append(ch);
        }
    }
    System.out.println(s2);
  }
}