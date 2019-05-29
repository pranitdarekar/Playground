import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    StringBuilder sb1=new StringBuilder(s1);
    StringBuilder sb2=new StringBuilder(s2);
    StringBuilder sb3=new StringBuilder();
    int n1=sb1.length();
    int n2=sb2.length();
    for(int i=0;i<n1;i++){
      int flag=0;
    	for(int j=0;j<n2;j++){
        	if(sb1.charAt(i)==sb2.charAt(j)){
            	flag=1;
            }
        }
      if(flag==0){
      	sb3=sb3.append(s1.charAt(i));
      }
    }
    System.out.println(sb3);
    
    
  }
}