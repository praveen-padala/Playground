import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader obj1 = new BufferedReader(obj);
        List<String> list = new ArrayList<String>();
        int option;
        boolean is_exit = true;
        do
        {
            System.out.println("Choose any one:");
            System.out.println("1.Insert");
            System.out.println("2.delete");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            option = Integer.parseInt(obj1.readLine());
            switch(option)
            {
              case 1:  String str = obj1.readLine();
                       String input[] = str.split(",");
                        
                       for(int i = 0; i < input.length; i++)
                        {
                              list.add(input[i]);
                          }
                          break;
              case 2: System.out.print("Enter the index value to be deleted:");
                      int index = Integer.parseInt(obj1.readLine());
                      System.out.println(index);
                      list.remove(index);
                       break;
              case 3:System.out.println(list);
                     break;
              case 4: is_exit = false;
            }
        }
            while(is_exit);
               
                      
                       
            
    }
}