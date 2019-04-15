import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
         Scanner in = new Scanner(System.in);
         int row = in.nextInt();
         int column = in.nextInt();
         int curRow;
        for(int i = row; i > 0; i--)
        {
             curRow = row - i;
             column = row;
             while(curRow != 0)
             {
                  System.out.print(column);
                  column--;
                  curRow--;
             }
             for(int j = (row - i); j < row; j++)
               System.out.print(i);
            System.out.println();
        }
    }
}