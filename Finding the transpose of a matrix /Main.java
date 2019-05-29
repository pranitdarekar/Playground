import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
        	a[i][j]=sc.nextInt();
        }
    }
    int b[][]=new int[col][row]; 
    
    for(int k=0;k<row;k++){
    	for(int l=0;l<col;l++){
        	b[l][k]=a[k][l];
        }
    }
    for(int p=0;p<row;p++){
    	for(int q=0;q<col;q++){
        	System.out.print(b[p][q]+" ");
        }
      System.out.println();
    }
  }
}