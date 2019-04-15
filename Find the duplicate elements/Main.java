import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
        TreeSet set = new TreeSet();
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader obj1 = new BufferedReader(obj);
        String str = obj1.readLine();
        String input[] = str.split(",");
        int newSize, prevSize = 0;
        System.out.println("Duplicate Entry is:");
        for(int i = 0; i < input.length; i++)
        {
             set.add(input[i]);
             newSize = set.size();
             if(newSize == prevSize)
                 System.out.println(input[i]);
             prevSize = newSize;
        }
       System.out.println("TreeSet is : "+set);
                 
    }
}