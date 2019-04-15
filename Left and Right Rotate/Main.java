import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
       Scanner in = new Scanner(System.in);
       int size = in.nextInt();
       int array[] = new int[size];
       
       for(int i = 0;i< size; i++)
          array[i] = in.nextInt();
       int no_of_rotations = in.nextInt();
       int temp = 0;
       
       for(int i = 0; i < size; i++)
       {
            if(array[i] == -1)
              continue;
            for(int j = i + 1; j < size; j++)
            {
                 if(array[i] == array[j])
                 {
                      array[j] = -1;
                      temp++;
                 }
            }
       }
      int modified_array[] = new int[size-temp];
       int counter = 0;
      for(int i = 0; i < size; i++)
      {
           if(array[i] != 0)
           {
                modified_array[counter] = array[i];
                counter++;
           }
      }
      left_rotation(modified_array, no_of_rotations, counter);
      right_rotation(modified_array, no_of_rotations, counter);
      for(int i = 0; i < counter; i++)
        System.out.print(modified_array[i]+" ");
       
    
  	}
    public static void right_rotation(int modified_array[], int no_of_rotations, int counter)
    {
         int temp1, temp2;
         for(int i = 0; i < no_of_rotations; i++)
         {   
              temp1 = modified_array[0];
              for(int j = 0; j < counter - 2; j++)
              {
                   if(j % 2 == 0)
                   {
                     temp2 = modified_array[j+2];
                    modified_array[j+2] = temp1;
                     temp1 = temp2;
                   }
              }
              modified_array[0] = temp1;
         }
    }
  public static void left_rotation(int modified_array[], int no_of_rotations, int counter)
  {
       int temp;
       for(int i = 0; i < no_of_rotations; i++)
       {
             temp = modified_array[1];
            for(int j = 0; j < counter-2; j++)
            {
                 if(j % 2 != 0)
                 {
                     modified_array[j] = modified_array[j+2];
                 }
            }
            if(counter % 2 == 0)
            modified_array[counter-1] = temp;
            else
              modified_array[counter -2 ] = temp;
       }
  }
                 
}