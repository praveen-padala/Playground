import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code 
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int length = str.length();
    StringBuilder str1 = new StringBuilder("");
    
    for(int index = 0; index < length; index++)
    {
      if(str.charAt(index) == 'a' || str.charAt(index) == 'A'
         ||str.charAt(index) == 'e' || str.charAt(index) == 'E'
         ||str.charAt(index) == 'i' || str.charAt(index) == 'I'
         ||str.charAt(index) == 'o' || str.charAt(index) == 'O'
         ||str.charAt(index) == 'u' || str.charAt(index) == 'U'
         )
        continue;
      else
      {
          str1.append(str.charAt(index));
      }
    }
    System.out.print(str1);
          
  }
}