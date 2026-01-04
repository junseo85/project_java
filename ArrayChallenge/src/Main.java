import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       // Random random = new Random();
//        int[] newInt = new int[10];
//
//        for (int i = 0; i <10; i++){
//            newInt[i]= random.nextInt(100);
//        }
//        System.out.println(Arrays.toString(newInt));
//        Arrays.sort(newInt);
//        System.out.println(Arrays.toString(newInt));
//        //sort in reverse order
//        int[] desInt = new int[10];
//        int count =0;
//        for (int i = 9; i >=0; i--){
//            desInt[i]= newInt[count];
//            count ++;
//        }
//        System.out.println(Arrays.toString(desInt));

        int[] unsortedArray = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortIntegers(new int[]{7,30,35});
        System.out.println(Arrays.toString(sortedArray));

    }
    public static int[] getRandomArray(int len){
        Random random = new Random();
        int[] randomArray = new int[len];
        for (int i = 0; i < len; i++){
            randomArray[i] = random.nextInt(1000);

        }
        return randomArray;
    }

    private static int[] sortIntegers(int[] array){
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i=0; i <sortedArray.length-1; i++){
                if (sortedArray[i]< sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("----->"+ Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
