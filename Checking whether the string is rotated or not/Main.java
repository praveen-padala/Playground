import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
       Scanner in = new Scanner(System.in);
         String str = in.nextLine();
         String sub_str = in.nextLine();
         String temp = str.concat(str);
         int length1 = temp.length();
         int length2 = sub_str.length();
         int man = (length1 - length2);
           man--;
          
         
         boolean is_sub = true;
        
        for(int index = 0; index < man; index++)
        {
             is_sub = true;
             for(int index_1 = 0; index_1 < length2; index_1++)
             {
                     if(temp.charAt(index + index_1) != sub_str.charAt(index_1))
                     {
                          is_sub = false;
                          break;
                     }
             }
                        
                        if(is_sub == true)
                        break;
       }
     if(is_sub == true)
         System.out.println("Yes");
      else
          System.out.println("No");
    }
}