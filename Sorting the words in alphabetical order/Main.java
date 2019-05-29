import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String a[]=new String[n];
    int b[]=new int[n];
    for(int i=0;i<n;i++){
    	a[i]=sc.next();
      	b[i]=a[i].length();
    }
    int max=0;
    for(int j=0;j<n;j++){
      if(b[j]>max){
      	max=b[j];
      }
    }
    for(int k = 0; k<n-1; k++) {
         for (int l = k+1; l<a.length; l++) {
            if(a[k].compareTo(a[l])>0) {
               String temp = a[k];
               a[k] = a[l];
               a[l] = temp;
            }
         }
      }
    for(int z=0;z<n;z++){
    	System.out.println(a[z].toLowerCase());
    }
    
  }
}