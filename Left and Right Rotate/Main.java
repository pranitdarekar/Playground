import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[100];
    
    for(int i=0;i<n;i++){
    	a[i]=sc.nextInt();
    }
    int r=sc.nextInt();
    odd_arrange(a,n,r);
    /*for(int x=0;x<n;x++){
    	System.out.print(a[x]+" ");
    }*/
    even_arrange(a,n,r);
    for(int x=0;x<n;x++){
    	System.out.print(a[x]+" ");
    }
  	}
  public static void odd_arrange(int a[],int n,int r){
    int temp=0;
  	if(n%2==0){
    	for(int i=1;i<=r;i++){
        	temp=a[n-2];
          	for(int q=n-2;q>=2;q=q-2){	
            	a[q]=a[q-2];
            }
          	a[0]=temp;
        }
    }
    else if(n%2 != 0){
      	for(int k=1;k<=r;k++){
        	temp=a[n-1];
          	for(int l=n-1;l>=2;l=l-2){
            	a[l]=a[l-2];
            }
          	a[0]=temp;
        }
    
    }
  }
  public static void even_arrange(int a[],int n,int r){
  	int temp=0;
    if(n%2==0){
    	for(int i=1;i<=r;i++){
        	temp=a[1];
          	for(int j=1;j<=n-3;j=j+2){
            	a[j]=a[j+2];
            }
          	a[n-1]=temp;
        }
    }
    else if(n%2 != 0){
    	for(int k=1;k<=r;k++){
        	temp=a[1];
          	for(int l=1;l<=n-3;l=l+2){
            	a[l]=a[l+2];
            }
          	a[n-2]=temp;
        }
    }
  }
}