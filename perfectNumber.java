import java.util.*;

public class perfectNumber {
    public static void main(String[] args){
        System.out.println(perfectNum(7, 29));

    }

    public static boolean isPerfect(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int i = 1;
        int sum = 0;
        while(i < n){
            if(n % i == 0){
                factors.add(i);
            }
            i++;
        }
        for(int j = 0; j < factors.size(); j++){
            sum += factors.get(j);
        }
        return sum == n;
    }

    public static int perfectNum(int x, int y){
        for(int i = x; i <= y; i++){
            if(isPerfect(i)){
                return i;
            }
        }
        return -1;
    }
}
