import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code 
       Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      



int temp = 1;
      for(int cur_row=1; cur_row<= number;cur_row++)
      {
        for(int space = 1; space <= number - cur_row; space++)
          System.out.print(" ");
        for(int star = 1; star<= temp;star++)
          System.out.print("*");
         temp = temp + 2;
         System.out.println();
      }



	}
}