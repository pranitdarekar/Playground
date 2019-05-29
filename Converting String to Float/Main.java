import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    StringBuilder st=new StringBuilder(str);
    int len=st.length();
    int count=0;
    int idx=len-1;
    int i=0;
    int flag=0;
    while(i<len){
      	if(st.charAt(i)==46){
    	flag=1;
        }
      	i++;
    }
    if(flag==1){
    while(st.charAt(idx)!=46){
    	count++;
      	idx--;
    }
    int index=0;
    double n=0;
    while(index<len-count-1){
    	if((st.charAt(index)>=48) && (st.charAt(index)<=57)){
        n=n*10+(st.charAt(index)-48);
        index++;
        }
    }
    index++;
    while(index<len){
    	if((st.charAt(index)>=48) && (st.charAt(index)<=57)){
        	n=n*10+(st.charAt(index)-48);
          	index++;
        }
    }
    while(count>0){
    	n=n/10;
      	count--;
    }
    System.out.printf("%.6f",n);
    }
    else{
      int index=0;
    double n=0;
    while(index<len){
    	if((st.charAt(index)>=48) && (st.charAt(index)<=57)){
        n=n*10+(st.charAt(index)-48);
        index++;
        }
    }
      System.out.printf("%.6f",n);
    }
  }
}