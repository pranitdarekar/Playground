import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    }
    for(int j=0;j<n-1;j++){
      
    	for(int k=j+1;k<n;k++){
            int flag=0;
        	if(a[k]>a[j]){
            	for(int l=j+1;l<k;l++){
                	if(a[l]<a[k]){
                    	flag=0;
                    }
                  	else if(a[l]>a[j]){
                    	flag=1;
                    }
                }
              if(flag==0){
              	System.out.println(a[j]+","+a[k]);
              }
            }
        }
    }
  }
}