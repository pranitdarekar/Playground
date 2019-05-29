import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String ss=s.toLowerCase();
      StringBuilder s1=new StringBuilder(ss);
      int n=s1.length();
      char ch='a';
      for(int i=0;i<26;i++){
        Boolean flag=false;
      	for(int j=0;j<n;j++){
        	if(s1.charAt(j)==ch){
            	flag=true;
            }
        }
        if(flag==false){
        	System.out.print(ch+" ");
        }
        ch++;
      }
      
    }
}