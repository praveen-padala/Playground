import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      
 Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      for(int cur_row = 0; cur_row < number;cur_row++)
      {
        for(int cur_col = (number-cur_row); cur_col >= 1;cur_col--)
             System.out.print(cur_col);
             System.out.println();
      }
        
	
	}
}