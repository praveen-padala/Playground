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
      int from_first = 0, from_last = (size - 1);
      boolean is_palindrome = true;
       
      while(from_first < from_last)
      {
           if(array[from_first] == array[from_last])
           {
                from_first++;
                from_last--;
           }
          else
          {
               is_palindrome = false;
               break;
          }
      }
      if(is_palindrome == true)
           System.out.print("Yes");
      else
           System.out.print("No");
             
    }
}