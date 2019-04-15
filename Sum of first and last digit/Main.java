import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int first_digit=0, last_digit;
      
      last_digit = number % 10;
      while(number > 0)
      {    
           number = number / 10;
           if(number != 0)
           first_digit = number;
          
      }
      System.out.println(first_digit+last_digit);
      
      
	}
}