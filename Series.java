import java.util.*;
public class Series {
    public static void main(String[] args){
        System.out.println((seriesSum(8, 8)));
    }

    public static int seriesSum(int x, int y){
        if( x <= 0 || y <= 0 || x > 255 || y > 255){
            return 0;
        }
        int first = 7;
        int second = 6;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; (y < x) ? i < x : i < y; i++){
            if(i % 2 == 0){
                list.add(first);
                first++;
            }
            else{
                list.add(second);
                second -= 2;
            }
        }
        return list.get(x - 1) + list.get(y - 1);
    }
}
