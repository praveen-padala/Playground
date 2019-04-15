import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String st = in.nextLine();
      StringBuilder str = new StringBuilder(st);
      int length = str.length();
      int stack[] = new int[26];
      char ch;
      int offset;
      
      for(int index = 0; index < length; index++)
      {
          if(str.charAt(index) == ' ')
               continue;
          if(str.charAt(index) >= 'A' && str.charAt(index) <= 'Z')
          {
               ch = (char) (str.charAt(index) + 32);
               str.setCharAt(index, ch);
          }
          offset = str.charAt(index) - 'a';
          stack[offset]++;
      }
      for(int index = 0; index < 26; index++)
      {
           if(stack[index] == 0)
           {
                ch = (char) (index + 'a');
                System.out.print(ch);
                System.out.print(" ");
           }
      }
          
            
    }
}