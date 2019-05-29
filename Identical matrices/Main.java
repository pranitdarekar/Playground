import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    int b[][]=new int[row][col];
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
        	a[i][j]=sc.nextInt();
        }
    }
    for(int k=0;k<row;k++){
    	for(int l=0;l<col;l++){
        	b[k][l]=sc.nextInt();
        }
    }
    int flag=0;
    for(int x=0;x<row;x++){
    	for(int y=0;y<col;y++){
        	if(a[x][y]!=b[x][y]){
            	flag=1;
            }
        }
    }
    if(flag==0){
    	System.out.println("Yes");
    }
    else{
    System.out.println("No");
    }
  }
}