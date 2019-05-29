import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    StringBuilder s1=new StringBuilder(s);
    StringBuilder s2=new StringBuilder(s);
    int n=s1.length();
    int len=0;
    for(int i=0;i<n;i++){
      	int count=0;
      	StringBuilder s4=new StringBuilder();
    	while((i+count)<n && s1.charAt(i+count)!=' '){
          	char cs=s1.charAt(i+count);
          	s4.append(cs);
        	count++;
        }
      int flag=1;
      for(int j=0;j<i-count;j++){
      	len=0;
        StringBuilder s3=new StringBuilder(' ');
        while(len<count){
        	char c=s1.charAt(j+len);
          	s3.append(c);
          	len++;
          	//System.out.println(s3);
        }
        //System.out.println(s3);
        if(s3.toString().equals(s4.toString())){
          flag=0;
        }
      }
      if(flag==1){
      System.out.print(s4+" ");
      }
      i=i+count;
    }
  }
}