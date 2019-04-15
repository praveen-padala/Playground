import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
       InputStreamReader obj = new InputStreamReader(System.in);
      BufferedReader obj1 = new BufferedReader(obj);
      Set set = new LinkedHashSet();
      String str = obj1.readLine();
      String input[] = str.split(",");
      for(String st : input)
      {
          set.add(st);
      }
      System.out.println(set);
      System.out.print("Enter the value to be deleted: ");
      str = obj1.readLine();
      System.out.println(str);
      set.remove(str);
      System.out.println(set);
      System.out.print("Enter the value to be added: ");
      str = obj1.readLine();
      System.out.println(str);
      set.add(str);
      System.out.println(set);
      
    }
}