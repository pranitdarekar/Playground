import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      
      StringBuilder a=new StringBuilder(s1);
      StringBuilder b=new StringBuilder(s2);
      //String s3=s1.append(s1);
      StringBuilder c=new StringBuilder();
      c=a.append(a);
      //System.out.println(c);
      int n1=c.length();
      int n2=b.length();
      Boolean flag=false;
      for(int i=0;i<n1-n2;i++){
      	//StringBuilder s3=new StringBuilder();
        String s3;
        s3=c.substring(i,n2+i);
        StringBuilder s4=new StringBuilder(s3);
        //System.out.println(s4);
        if(s4.toString().equals(b.toString())){
        	flag=true;
        }
      }
      if(flag==true){
      System.out.println("Yes");
      }
      else{
      System.out.println("No");
      }
    }
}