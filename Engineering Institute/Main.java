//import required packages
import java.util.Scanner;
class Faculty
{
  int salary;
  Faculty()
  {
      
  }
  Faculty(int salary)
  {
       this.salary = salary;
  }
  public void salary()
  {
    //write your Faculty class statements
     if(this.salary <= 0)
       System.out.println("Base Salary: "+"null");
    else
        System.out.println("Base Salary: "+this.salary);
  }
}
class CSE extends Faculty
{
  CSE(int salary)
  {
  		this.salary = salary;
        }
  
  public void salary()
  {
    //write your CSE class statements
    if(this.salary <= 0)
       System.out.println("CSE Faculty: "+"null");
    else
        System.out.println("CSE Faculty: "+(this.salary + 3000));
  }
}
class IT extends Faculty
{
  IT(int salary)
  {
  	this.salary = salary;
    }
  public void salary()
  {
    if(this.salary <= 0)
       System.out.println("IT Salary: "+"null");
    else
        System.out.println("IT Faculty: "+(this.salary + 5000) );
  }
}
class ECE extends Faculty
{
   	ECE(int salary)
    {
    	this.salary = salary;
        }
  public void salary()
  {
    //write your ECE class statements
    if(this.salary <= 0)
       System.out.print("ECE Faculty: "+"null");
    else
        System.out.print("ECE Faculty: "+(this.salary + 4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int salary = in.nextInt();
   
     
    ECE obj = new ECE(salary);
   
    CSE cse = new CSE(salary);
    IT it = new IT(salary);
    Faculty faculty = new Faculty(salary);
    faculty.salary();
    cse.salary();
    it.salary();
    obj.salary();
    
    
    //implement your required concept here
    
  }
}