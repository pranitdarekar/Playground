import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    }
    int last=n/2;
    int first=last+1;
    for(int j=0;j<last-1;j++){
      int temp=0;
    	for(int k=0;k<last-1;k++){
        	if(a[k]>a[k+1]){
            	temp=a[k];
              	a[k]=a[k+1];
              	a[k+1]=temp;
            }
        }
    }
    for(int l=n-1;l>first-1;l--){
      int tmp=0;
    	for(int o=n-1;o>first-1;o--){
        	if(a[o]>a[o-1]){
            	tmp=a[o];
              	a[o]=a[o-1];
              	a[o-1]=tmp;
            }
        }
    }
    for(int z=0;z<n;z++){
    System.out.print(a[z]+" ");
    }
                       
  }
}