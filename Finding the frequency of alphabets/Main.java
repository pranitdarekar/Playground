import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      String ss=s.toLowerCase();
      StringBuilder s1=new StringBuilder(ss);
      int n=s1.length();
      for(int i=0;i<n;i++){
      	if(s1.charAt(i)>= 'a' && s1.charAt(i)<= 'z'){
          int count=1;
        	for(int j=i+1;j<n;j++){
              char a=s1.charAt(i);
              char b=s1.charAt(j);
            	if(a==b){
                	count++;
                  
                  	s1.setCharAt(j,'$');
                }
              //System.out.println(count+" ");
              	
            }
          System.out.print(s1.charAt(i)+""+count+" ");
        }
      }
    }
}