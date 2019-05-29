import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      //System.out.println("arr_size= ");
      int arr_size=sc.nextInt();
      //System.out.println("arr[]= ");
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++){
      	arr[i]=sc.nextInt();
      }
      //System.out.println("search_elem_1= ");
      int search_elem_1=sc.nextInt();
      //System.out.println("search_elem_2= ");
      int search_elem_2=sc.nextInt();
      int element_1_index=-1;
      int element_2_index=-1;
      for(int i=0;i<arr_size;i++){
      	if(search_elem_1==arr[i]){
        	element_1_index=i;
        }
        if(search_elem_2==arr[i]){
        	element_2_index=i;
        }
      }
      System.out.println(element_1_index);
      System.out.println(element_2_index);
    }
  
}