import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      
      for(int i = 2; i <= number; i++)
      {
           prime(i);
      }
      
       
	}
    public static void prime(int number)
    {
         int flag = 1;
         for(int i = 2; i < number; i++)
         {
            if (number % i == 0)
            { 
                 flag = 0;
                 break;
            }
         }
         if(flag == 1)
           System.out.println(number);
    }
           
           
      
}