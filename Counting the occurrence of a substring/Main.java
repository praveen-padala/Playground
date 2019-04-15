import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    int count = 0;
    int str1_length = str1.length();
    int str2_length = str2.length();
    boolean is_match;
    
    for(int i = 0; i <= (str1_length - str2_length); i++)
    {    
         is_match = true;
         for(int j = 0; j < str2_length; j++)
         {
              if(str1.charAt(i + j) != str2.charAt(j))
                 {
                      is_match = false;
                      break;
                 }
           }
              if(is_match == true)
                 {
                     count++;
                 }
     }
                 System.out.println(count);
                
  } 
}