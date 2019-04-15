import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code 
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder str1 = new StringBuilder(str);
      int length = str.length();
      reverse_string(str1, 0, length);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
        StringBuilder str2 = new StringBuilder("");
        char array[] = new char[end_idx];
        int count = 0;
        int temp;
        for(int i = (end_idx - 1); i >= 0; i--)
        {
             if(sb.charAt(i) == ' ')
             {
                  if(array[0] == ' ')
                     temp = 1;
                   else
                      temp = 0;
                  for(int j = (count - 1); j >= temp; j--)
                  { 
                      
                       str2.append(array[j]);
                  }
                  str2.append(' ');
                  count = 0;
             }
             array[count++] = sb.charAt(i);
        }
        for(int i = (count - 1); i >= 0; i--)
             str2.append(array[i]);
      System.out.println(str2);
    }
}