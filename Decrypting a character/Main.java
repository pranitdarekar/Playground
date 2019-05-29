import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      char ch=sc.next().charAt(0);
      int k=sc.nextInt();
      int n=ch;
      char c;
      if(n>=97 && n<=122){
      	c=(char)((ch+(26-k)-97)%26+97);
        System.out.print(c);
      }
      else if(n>=65 && n<=90){
      	c=(char)((ch+(26-k)-65)%26+65);
        System.out.print(c);
      }
      
      
    }
}