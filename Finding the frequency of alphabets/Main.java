import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String st = in.nextLine();
      StringBuilder str = new StringBuilder(st);
      int count;
      int length = str.length();
      char ch;
      
      for(int index_1 = 0; index_1 < length; index_1++)
      {   
           if(str.charAt(index_1)== ' ')
              continue;
           if(str.charAt(index_1) >= 'A' && str.charAt(index_1) <= 'Z')
           {
                ch =(char) (str.charAt(index_1) + 32);
                str.setCharAt(index_1, ch);
           }
                
                
               
           count = 1;
           for(int index_2 = (index_1 + 1); index_2 < length; index_2++)
           {
                if(str.charAt(index_1) == str.charAt(index_2))
                { 
                    str.setCharAt(index_2, ' ');
                     
                     ++count;
                }
           }
           System.out.print(str.charAt(index_1) +""+count+" ");
      }
      
               
    }
}