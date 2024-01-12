import java.util.*;
public class Sorting {
    public static void main(String[] args){
        int[] test = new int[]{1, 20, 33, 13, 10, 60, 92, 100, 21};
        System.out.println(Arrays.toString(sort(test)));
    }

    public static int[] sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int div = 10;
            if(arr[i] % div == arr[i - 1] % div){
                div = 100;
            }
            if(arr[i] % div < arr[i - 1] % div){
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                i = 0;
            }
        }
        return arr;
    }
}
