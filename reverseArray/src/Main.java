import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    int[] array = {1,2,3,4,5};
    System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(reverse(array)));
    System.out.println(Arrays.toString(reverseCopy(array)));

    }
    private static int[] reverse(int[] array){
        //int[] reverse = new int[array.length];
        //int count = 0;
//        for (int i = array.length-1; i>=0; i--){
//            reverse[count] = array[i];
//            count ++;
//        }
        int maxIndex = array.length -1;
        int halfLength = array.length /2;
//swapping original array and return
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        return array;
    }

    private static int[] reverseCopy(int[] array){
        //creating new array
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length-1;

        for (int el: array){
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}
