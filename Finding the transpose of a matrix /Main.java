import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner in = new Scanner(System.in);
       int rows = in.nextInt();
       int columns = in.nextInt();
       int matrix[][] = new int[rows][columns];
       int matrix1[][] = new int[rows][columns];
    
      for(int row = 0; row < rows; row++)
             {
                  for(int column = 0; column < columns; column++)
                    {
                        matrix[row][column] = in.nextInt();
                     }
             }
         for(int row = 0; row < rows; row++)
             {
                  for(int column = 0; column < columns; column++)
                    {
                        matrix1[column][row] = matrix[row][column];
                     }
             }
     for(int row = 0; row < columns; row++)
             {
                  for(int column = 0; column < rows; column++)
                    {
                        System.out.print(matrix[row][column]+" ");
                     }
                    System.out.println();
     }
  }
}