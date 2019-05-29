import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col =sc.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
        	a[i][j]=sc.nextInt();
        }
    }
    int r1=0;
    int c1=0;
    while(r1<row && c1<col){
    	for(int k=r1+0;k<row;k++){
        	for(int l=c1+0;l<col;l++){
            	if(k==l){
                	System.out.print(a[k-r1][l]+" ");
                }
            }
        }
      r1++;
      c1++;
    }
  }
}