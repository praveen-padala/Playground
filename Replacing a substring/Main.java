import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String sub_str = in.nextLine();
      String rep_str = in.nextLine();
      StringBuilder res_str = new StringBuilder("");
      int length1 = str.length();
      int length2 = sub_str.length();
      length1 = length1 - (length2 );
      boolean is_sub = true;
      int index = 1, len;
      
      for(int i = 0; i <= length1; i++)
      { 
           is_sub = true;
           for(int j = 0; j < length2; j++)
           {
                if(str.charAt(i + j) != sub_str.charAt(j))
                {
                     is_sub = false;
                     break;
                }
           }
        if(is_sub == true)
        {
          index = i;
          break;
          
        }
      }
      length1 = str.length();
      len = rep_str.length();
      for(int i = 0; i < length1; i++)
      {
           if(index == i)
           {
               for(int j = 0; j < len; j++)
               {
                    res_str.append(rep_str.charAt(j));
               }
               i = i + (sub_str.length() -1);
           }
          else
            res_str.append(str.charAt(i));
      }
      System.out.println(res_str);
                                  
    }
}