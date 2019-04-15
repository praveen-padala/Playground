import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int array[] = new int[size];
      
       for(int index = 0; index < size; index++)
            array[index] = in.nextInt();
    
      /* the first loop take  element(which is fixed one), second loop takes the element  one by one until last element, next to the 
         fixed element and it compares both if the fixed_index element is less than the vary_index element then  it prints both else continues and compares with the 
         next element
      */
    for(int fixed_index = 0; fixed_index < size; fixed_index++)
    {
         for(int vary_index = fixed_index + 1; vary_index < size; vary_index++)
         {
              if(array[fixed_index] < array[vary_index])
                   System.out.println(array[fixed_index]+","+array[vary_index]);
         }
    }
    
    
  }
}