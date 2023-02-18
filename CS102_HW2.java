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

    public static void findAvAndDifference(int[] input)
    {
        int sum = 0;
        int average;
        int[] difference = new int[input.length];
        for(int i = 0; i < input.length; i++)
        {
            sum = sum + input[i];
        }
        average = sum / input.length;
        
        for(int a = 0; a < input.length; a++)
        {
            difference[a] = input[a] - average;
        }

        System.out.println("The average of the array is: " + average);
        System.out.print("The differences from the average is: {");
        for(int k = 0; k < difference.length; k++)
        {
            if(k != difference.length - 1)
            {
            System.out.print(difference[k] + ",");
            }
        }
        System.out.print(difference[difference.length - 1] + " .}");
        System.out.println();
 

    } 
 

    public static int sumOfOdd(int[] input)
    {
        int sum = 0;
        for(int i = 1; i < input.length; i+=2)
        {
            sum = sum + input[i];
        }
        return sum;

    }
    public static int sumOfEven(int[] input)
    {
        int sum = 0;
        for(int i = 0; i < input.length; i+=2)
        {
            sum = sum + input[i];
        }
        return sum;

        
    }

        
    }
    

