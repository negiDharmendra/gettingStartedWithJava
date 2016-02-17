package myUtil;

public class ArrayUtil {
    private static void printArrays(int [] numbers){
        System.out.print("[");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]);
            if(i<numbers.length-1)
                System.out.print(",");
        }
        System.out.println("]");
    }
    public static void print(int [] numbers){
        printArrays(numbers);
    }
    public static boolean deepEqual(int [] array1,int [] array2){
        if(array1.length!=array2.length)
            return false;
        for(int i = 0; i<array1.length; i++)
            if(array1[i]!=array2[i])
                return false;
        return true;
    }
    public static int [] reverse(int [] numbers){
        int [ ]reversed;
        reversed = new int [numbers.length];
        for (int i =numbers.length-1; i>=0; i--)
            reversed[numbers.length-1-i] = numbers[i];
        return reversed;
    }
}
