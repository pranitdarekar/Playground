import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder s1=new StringBuilder(s);
    s1.append(' ');
    int n=s1.length();
    int len=0;
    for(int i=0;i<n;i++){
      	
      	char ch=s1.charAt(i);
      	//System.out.print(len);
    	if(ch != ' '){
        	len++;
        }
      	else if(ch == ' '){
          	//System.out.print(len);
        	reverse(s1,len,(i-len));
          	len=0;
        }
    }
  }
  public static void reverse(StringBuilder s1,int len,int start){
  	for(int j=start+len-1;j>=start;j--){
    	System.out.print(s1.charAt(j));
    }
    System.out.print(" ");
  }
}