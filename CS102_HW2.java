import java.util.Random;
import java.util.Scanner;

public class CS102_HW2{

    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int sizeofArray = in.nextInt();
        int[] data = new int[sizeofArray];
        boolean keepselecting = true;
        
        for(int i = 0 ; i < data.length ; i++){
            data[i] = (randomNum.nextInt(101));
        }
    }

    public static int largest(int[] input)
    {
         int maximum = Integer.MIN_VALUE;
         
        
        for (int m = 0; m < input.length; m++)
        {
            if (input[m] > maximum)
            {
                maximum = input[m];
            }
        }
            
         
        return maximum;
    }
    public static int smallest(int[] input)
    {
        int minimum = Integer.MAX_VALUE;

        for (int m =0; m < input.length; m++)
        {
            if (input[m] < minimum)
            {
                minimum = input[m];
            }
        }
        return minimum;
    }
}