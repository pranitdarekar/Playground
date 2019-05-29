import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      StringBuilder sb=new StringBuilder(s);
      int n=sb.length();
      int end=0;
      for(int i=n-1;i>=0;i--){
        int len=0;
        int copy_i=i;
        if(sb.charAt(copy_i)== ' '){
        }
        else{
      	while(copy_i>=0 && sb.charAt(copy_i)!= ' ' && copy_i>=0){
        	//System.out.print(copy_i+" ");
          	copy_i--;
          	len++;
        }
          //System.out.println(len);
        end=copy_i+len;
        reverse_string(sb,copy_i+1,end);
        copy_i++;
        i=copy_i;
        }
      }
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      for(int i=start_idx;i<=end_idx;i++){
      	System.out.print(sb.charAt(i));
        //System.out.println(i);
      }
      System.out.print(" ");
    }
}