package main.programmers.lessons181924;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {0,1,2,3,4};
        int[][] queries = {{0,3},{1,2},{1,4}};
        System.out.println(Arrays.toString(sl.solution(arr, queries)));
    }
}
