import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder s1=new StringBuilder(s);
    int n=s1.length();
    int key=sc.nextInt();
    
    for(int i=0;i<n;i++){
      char ch=s1.charAt(i);
    	if(ch>='A' && ch<='Z'){
        	int offset=ch-'A';
          	offset=(offset-key)%26;
          	ch=(char)(offset+'A');
          	System.out.print(ch);
        }
      	else if(ch>='a' && ch<='z'){
        	int offset=ch-'a';
          	offset=(offset-key);
          	if(offset<0){
            	offset=offset+26;
            }
          	offset=offset%26;
          //System.out.println(offset);
          	ch=(char)(offset+'a');
          	System.out.print(ch);
        }
      	else if(ch==' '){
        	System.out.print(" ");
        }
    }
  }
}