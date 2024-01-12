import java.util.*;
public class ToeplitzMatrix {
    public static void main(String[] args){
        int[][] test = new int[][]{{1, 2, 3, 4, 8, 1},
                                   {5, 1, 2, 3, 4, 8},
                                   {4, 5, 1, 2, 3, 4},
                                   {7, 4, 5, 1, 2, 3},
                                   {9, 7, 4, 5, 1, 2}};
        System.out.println(elements(test));
    }

    public static int elements(int[][] matrix){
        HashSet<Integer> list = new HashSet<Integer>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                list.add(matrix[i][j]);
                if(i < (matrix.length - 1) && j < (matrix[i].length - 1)){
                    if(matrix[i + 1][j + 1] != matrix[i][j]){
                        return -1;
                    }
                }
            }
        }
        return list.size();
    }
}
