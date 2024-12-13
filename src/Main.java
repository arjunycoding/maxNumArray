import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3};
        int maxNumber = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println("Out of this set of numbers: " + Arrays.toString(numbers) + "the highest number is " + maxNumber);
    }
}
