package main.programmers.lessons181895;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {1,2,3,4,5};
        int[][] intervlas = {{1,3}, {0,4}};
        ArrayList<Integer> result = sl.solution(arr, intervlas);

        System.out.println(Arrays.toString(new ArrayList[]{result}));
    }
}
