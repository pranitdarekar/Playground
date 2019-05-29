import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int copy=n;
    if(n<0){
    	n=n*(-1);
    }
    int temp = n;
    int count = 0;
    while(n > 0)
    {
        count++;
        n = n/10;
    }
    char str[] = new char[count];
    count = count - 1;
    while(temp > 0)
    {
      char ch = (char)((temp % 10) + '0');
      str[count] = ch;
      temp /= 10;
      --count;   
    }
    if(copy<0){
     System.out.print("-");
    System.out.print(str);
    }
    else{
    System.out.print(str);
    }

    
  }
}