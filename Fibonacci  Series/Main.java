import java.util.*;
class Fibonacci extends Thread
{
  // type your code here
  int number;
  Fibonacci(int number)
  {
     System.out.println("Enter the limit for Fibonacci: "+number);
     this.number = number;
  }
 public void run()
  {
     if(number <= 0)
     {
        System.out.println("Exception occurred");
        }
      else
      {
     int first = 0, second = 1;
     int sum = 0;
     System.out.print("The Fibonacci series is :");
     System.out.print(first+" ");
     System.out.print(second+" ");
     for(int i = 2; i < number; i++)
     {
        
         
         sum = first + second;
         System.out.print(sum+" ");
         first = second;
         second = sum;
         }
         }
         }
         
}
class Main
{
     public static void main(String[] args) 
     {
        // type your code here
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        Fibonacci obj = new Fibonacci(number);
        obj.start();
        
        
     }
}