import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int decode_length = in.nextInt();
    int length = str.length();
    int decoded_distance = 0;
    StringBuilder decoded_string = new StringBuilder("");
    for(int index = 0; index < length; index++)
    {
         if(str.charAt(index) == ' ')
         {
              decoded_string.append(' ');
              continue;
         }
         if(str.charAt(index) >= 'a' && str.charAt(index) <= 'z')
         {
              decoded_distance = str.charAt(index) - decode_length ;
              
               
              if(decoded_distance == 93)
              {
                   decoded_distance = 'z' - ('a' - decoded_distance - 1);
                   
              }
              decoded_string.append((char)decoded_distance);
         }
         else
         {
             decoded_distance = str.charAt(index) - decode_length ;
            
              if(decoded_distance < 65)
              {
                   decoded_distance = 'Z' - ('A' - decoded_distance - 1);
              }
              decoded_string.append((char)decoded_distance);
         }
    }
      System.out.print(decoded_string);
      
           
  }
}