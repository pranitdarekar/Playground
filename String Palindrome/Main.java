import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      StringBuilder sb=new StringBuilder(s);
      StringBuilder sb_copy=new StringBuilder();
      int n=sb.length();
      char ch;
      //System.out.println(sb_copy);
      for(int i=n-1;i>=0;i--){
      	ch=sb.charAt(i);
        //StringBuilder sa=new StringBuilder(ch);
        sb_copy.append(ch); 
        
        //sb.Append(sb[i]);
        
      }
      Boolean flag=true;
      //System.out.println(sb_copy);
      for(int j=0;j<n;j++){
      	if(sb.charAt(j)!=sb_copy.charAt(j)){
        	flag=false;
        }
      }
      if(flag==true){
      System.out.print("Yes");
      }
      else{
      System.out.print("No");
      }
    } 
}