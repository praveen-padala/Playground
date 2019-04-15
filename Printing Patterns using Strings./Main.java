import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int length = str.length();
    int start_index = (length - 1) / 2;
    int vary_start_index = start_index;
    int rem;
    
    for(int row = 0; row < length; row++)
    {
        vary_start_index = start_index;
        for(int space = row + 1; space < length; space++)
        {
             System.out.print(" ");
        }
        for(int print = 0; print <= row; print++)
        {
            rem = vary_start_index % length;
            System.out.print(str.charAt(rem));
            vary_start_index++;
        }
        System.out.println();
    }
             
          
  }
}