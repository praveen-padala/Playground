import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int array[] = new int[size];
      
       for(int index = 0; index < size; index++)
            array[index] = in.nextInt(); 
    int prev_element;
    /* the first loop take  element(which is fixed one), second loop takes the element  one by one until last element, next to the 
         fixed element and it compares both if the fixed_index  element is less than the vary_index element then and also it should be greater than the prev_vary_index element which satisfied 
          the condition (array[fixed_index] < array[vary_index]) then it prints both else continues and compares with the 
         next element
      */
    for(int fixed_index = 0; fixed_index < size; fixed_index++)
    {
         prev_element = 0;
         for(int vary_index = fixed_index + 1; vary_index < size; vary_index++)
         {
              if(array[fixed_index] < array[vary_index] && array[vary_index]> prev_element )
              {
                   System.out.println(array[fixed_index]+","+array[vary_index]);
                   prev_element = array[vary_index];
              }
         }
    }
    
  }
  
}