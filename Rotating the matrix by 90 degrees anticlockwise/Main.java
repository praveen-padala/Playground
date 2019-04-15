import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
         Scanner in = new Scanner(System.in);
       int no_of_rows = in.nextInt();
       int no_of_cols = in.nextInt();
       int matrix[][] = new int[no_of_rows][no_of_cols];
    
       for(int row = 0; row < no_of_rows; row++)
       {
           for(int col = 0; col < no_of_cols; col++)
           {
                matrix[row][col] = in.nextInt();
           }
       }
      for(int col = (no_of_cols - 1); col >= 0; col--)
      {
           for(int row = 0; row < no_of_rows; row++)
           {
                System.out.print(matrix[row][col]+" ");
           }
           System.out.println();
      }
  }
}