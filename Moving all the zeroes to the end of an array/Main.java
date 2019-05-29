import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[100];
      //int b[]=new int[100];
      for(int i=0;i<n;i++){
      	a[i]=sc.nextInt();
      }
      /*for(int k=0;k<n;k++){
      	b[k]=a[k];
      }*/
      
      int count =0;
      int no=0;
      for(int j=0;j<n;j++){
        if(a[j]==0){
        	count=j;
          	arrange(a,n,count);
          	j=j-1;
          	no++;
        }
      }
      for(int x=n-no;x<n;x++){
      	a[x]=0;
      }
      for(int l=0;l<n;l++){
      	System.out.print(a[l]+" ");
      }
      
    }
  public static void arrange(int b[],int n,int count){
  	for(int i=count;i<n-1;i++){
    	b[i]=b[i+1];
      	//a[n-1]=0;
    }
    
    
  }
}