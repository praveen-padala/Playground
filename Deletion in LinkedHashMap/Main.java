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
      LinkedHashMap map = new LinkedHashMap();
      System.out.print("Enter the number of values to be inserted in map:");
      String str = obj1.readLine();
       String key, value;
       
      int noOfValues = Integer.parseInt(str);
      System.out.println(noOfValues);
      for(int i = 0; i < noOfValues; i++)
      {
           key = obj1.readLine();
           value = obj1.readLine();
          map.put(key, value);
      }
      System.out.println(map);
      System.out.print("Enter the index to be removed:");
      str = obj1.readLine();
      System.out.println(str);
      map.remove(str);
      System.out.println(map);
      System.out.println("Size of map is : "+map.size());
    }
}