import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int c=sc.nextInt();
      switch (c)
      {
        case (1):
          int side=sc.nextInt();
          int area=side*side;
          System.out.println(area);
          break;
        case (2):
          int l=sc.nextInt();
          int b=sc.nextInt();
          int area1=l*b;
          System.out.println(area1);
          break;
        case (3):
          int base=sc.nextInt();
          int h=sc.nextInt();
          double area2=(base*h)/2;
          System.out.println(area2);
          break;
        case (4):
          double r=sc.nextDouble();
          double area3= (3.14)*r*r;
          System.out.println(area3);
          break;
          
          
      }
    }
}