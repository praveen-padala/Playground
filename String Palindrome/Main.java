import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder string = new StringBuilder(str);
      StringBuilder string2 = new StringBuilder("");
      int length = str.length();
      
      for(int i = (length-1); i >= 0; i--)
           string2.append(string.charAt(i));
        if(str.equals(string2.toString()) == true)
          System.out.println("Yes");
      else
          System.out.println("No");
      
           
    } 
}