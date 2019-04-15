import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int temp, result = 1, sum = 0, rem;
      int number = in.nextInt();
      
      temp = number;
      while(number > 0)
      {
          result = 1;
           rem  = number % 10;
           for(int count = 1; count <= rem; count++)
           { 
                result = result * count;
           }
           sum = sum + result;
           number = number / 10;
      }
      
      if( temp == sum)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}