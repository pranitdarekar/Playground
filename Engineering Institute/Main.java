import java.util.Scanner;

//import required packages

class Faculty
{
  int baseFaculty;
  public void salary()
  {
	  
    //write your Faculty class statements
	  System.out.println("Base Salary: "+baseFaculty );
  }
}
class CSE
{
	int baseCSE;
  public void salary()
  {
    //write your CSE class statements
	  Faculty obj3=new Faculty();
	  obj3.baseFaculty=baseCSE;
	  obj3.salary();
	  baseCSE=baseCSE+3000;
	  System.out.println("CSE Faculty: "+baseCSE);
  }
}
class IT
{
	int baseIT;
  public void salary()
  {
    //write your IT class statements
	  CSE obj2=new CSE();
	  obj2.baseCSE=baseIT;
	  obj2.salary();
	  baseIT=baseIT+5000;
	  System.out.println("IT Faculty: "+baseIT);
  }
}
class ECE
{
	int baseECE;
  public void salary()
  {
    //write your ECE class statements
	  IT obj1=new IT();
	  obj1.baseIT=baseECE;
	  obj1.salary();
	  baseECE=baseECE+4500;
	  System.out.println("ECE Faculty: "+baseECE);
  }
}

class Main
{
	
  public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);
	 int base=sc.nextInt();
    ECE obj = new ECE();
    obj.baseECE=base;
    obj.salary();
    //implement your required concept here
  }
}