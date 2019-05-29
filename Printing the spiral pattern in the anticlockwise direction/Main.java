import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      //int val=1;
      int a[][]=new int[n][n];
      anti(a,n);
      for(int i=0;i<n;i++){
      	for(int j=0;j<n;j++){
        	System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
      
    }
  public static void anti(int a[][],int n){
  int minRow=0;
    int maxRow=n-1;
  int minCol=0;
    int maxCol=n-1;
  int val=1;
    while((minRow<maxRow) && (minCol<maxCol)){
    	for(int i=maxCol;i>=minCol;i--){
        	a[minRow][i]=val++;
          	//System.out.print(a[minRow][i]);
        }
      //System.out.println();
      for(int j=minRow+1;j<=maxRow;j++){
        	a[j][minCol]=val++;
        //System.out.print(a[j][minCol]);
        }
      //System.out.println();
      for(int k=minCol+1;k<=maxCol;k++){
        	a[maxRow][k]=val++;
        //System.out.print(a[maxRow][k]);
        }
      //System.out.println();
      for(int l=maxRow-1;l>minRow;l--){
        	a[l][maxCol]=val++;
       // System.out.print(a[maxCol][l]);
        }
      //System.out.println();
      minRow++;
      maxRow--;
      minCol++;
      maxCol--;
    }
  }
}