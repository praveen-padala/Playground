import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
       InputStreamReader obj = new InputStreamReader(System.in);
      BufferedReader obj1 = new BufferedReader(obj);
      TreeSet set = new TreeSet();
      String str = obj1.readLine();
      String input[] = str.split(",");
      for(String st : input)
      {
          set.add(st);
      }
      System.out.println(set);
      while(!set.isEmpty())
      {
           set.remove(set.last());
           System.out.println(set);
      }
    }
}