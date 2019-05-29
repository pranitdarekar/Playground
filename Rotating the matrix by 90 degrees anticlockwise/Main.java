import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
        	a[i][j]=sc.nextInt();
        }
    }
    for(int k = row-1; k >= 0; k--){
      for(int l = 0; l <= col-1; l++){
        System.out.print(a[l][k] + " ");
      }
      System.out.println();
    }
  }
}