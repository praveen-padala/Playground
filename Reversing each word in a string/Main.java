import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner in = new Scanner(System.in);
       String str = in.nextLine();
       int length = str.length();
       int no_of_chrctrs = 0, start_index;
       int index;
    
       for( index = 0; index < length; index++)
       {
            if(str.charAt(index) != ' ')
                 no_of_chrctrs++;
            else
            {
                 start_index = index - 1;
                 
                 
                 while(no_of_chrctrs != 0)
                 {
                      System.out.print(str.charAt(start_index));
                      start_index--;
                      no_of_chrctrs--;
                 }
                 System.out.print(" ");
            }
              
       }
    if(no_of_chrctrs > 0)
    {
         start_index = index - 1;
                 
                 
                 while(no_of_chrctrs != 0)
                 {
                      System.out.print(str.charAt(start_index));
                      start_index--;
                      no_of_chrctrs--;
                 }
    }
              
   
  }
}