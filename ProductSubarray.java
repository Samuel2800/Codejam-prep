import java.util.*;
public class ProductSubarray {
    public static void main(String[] args){
        Double[] test = new Double[]{-3.2, 4.2, 7.0, 5.4, -2.2, -2.5};
        System.out.println(Arrays.toString(subArray(test)));
    }
    public static Double product(Double[] arr){
        Double prod = 1.0;
        for(int i = 0; i < arr.length; i++){
            prod *= arr[i];
        }
        return prod;
    }

    public static Double[] subArray(Double[] arr){
        Double max = 0.0;
        HashMap<Double, Double[]> map = new HashMap<Double, Double[]>();
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                Double[] array = Arrays.copyOfRange(arr, i, j);
                Double prod = product(array);
                if(prod > max){
                    max = prod;
                    map.put(max, array);
                }
            }
        }
        return map.get(max);
    }
}
