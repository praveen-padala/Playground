import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int temp = 1;
      
      for(int cur_row = 1; cur_row <= number; cur_row++)
      {
        for(int space = 1; space <= number-cur_row; space++)
          System.out.print(" ");
        for(int numbr = 1; numbr <= cur_row; numbr++)
        {
          System.out.print(temp+" ");
          temp++;
        }
        System.out.println();
      }
      
      
      
      
    }    
}