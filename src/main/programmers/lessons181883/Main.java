package main.programmers.lessons181883;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,1}, {1,2}, {2,3}};
        String result = Arrays.toString(new ArrayList[]{sl.solution(arr, queries)});
        System.out.println(result);
    }
}
