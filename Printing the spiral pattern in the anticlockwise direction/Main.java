import java.util.Scanner;
 class Main
{
   public static void main(String args[])
   {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int ar[][] = new int[size][size];
    int k = 1;
    int l_r_len = size;
    int t_b_len = (size - 1);
    int r_l_len = (size - 1);
    int b_t_len = (size - 2);
    int row = 0, col = (size - 1);
    int no_of_rptns = (size * size);
    while(k <= no_of_rptns)
    {
        for(int i = 0; i < l_r_len; i++)
        {
            ar[row][col] = k++;
            col--;
        }
        l_r_len -= 2;
        col++;
        row++;
        for(int i = 0; i < t_b_len; i++)
        {
             ar[row][col] = k++;
             row++;
        }
        t_b_len -= 2;
        col++;
        row--;
        for(int i = 0; i < r_l_len; i++)
        {
             ar[row][col] = k++;
             col++;
        }
        row--;
        col--;
        r_l_len -= 2;
        for(int i = 0; i < b_t_len; i++)
        {
              ar[row][col] = k++;
              row--;
        }
        col--;
        row++;
        b_t_len -= 2;
   }
   for(int i = 0; i < size; i++)
   {
      for(int j = 0; j < size; j++)
      {
          System.out.print(ar[i][j]+" ");
      }
      System.out.println();
   }
}
}