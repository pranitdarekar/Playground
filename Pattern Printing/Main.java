import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc=new Scanner(System.in);
      int row=sc.nextInt();
      int col=sc.nextInt();
      for(int i=0;i<row;i++){
        int val=row;
        int count=i;
      	for(int j=0;j<col;j++){
        	if(count==0){
            System.out.print(val);
            }
          	else{
            System.out.print(val);
              count--;
              val--;
            }
        }
        System.out.println();
      }
    }
}