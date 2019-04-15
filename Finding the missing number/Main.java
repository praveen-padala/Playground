import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int array[] = new int[size];
        for(int index = 0; index < size; index++)
             array[index] = in.nextInt();
       boolean is_present = false;
        for(int number = 1; number <= size; number++)
        {
             is_present = false;
             for(int index = 0; index < size; index++)
             {
                  if(array[index] == number)
                  {
                       is_present = true;
                       break;
                  }
             }
             if(is_present == false)
             {
                  System.out.print(number);
                  break;
             }
        }
    }
}