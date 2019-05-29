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
    int max_val=0;
    for(int j=0;j<n;j++){
      	int key=j;
      	int index=j+1;
      	int max=0;
      	//int max_val=0;
    	while(index<n && a[index]>a[j]){
          	max=max+a[index];
          	j++;
          	index++;
          	
        }
      	if(max+a[key]>max_val){
        	max_val=max+a[key];
        }
    }
    System.out.println(max_val);
  }
}