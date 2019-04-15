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
      Set set = new LinkedHashSet();
      String str = obj1.readLine();
      String input[] = str.split(",");
      for(String st : input)
      {
          set.add(st);
      }
      System.out.println(set);
        
    }
}