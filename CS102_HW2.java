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
}