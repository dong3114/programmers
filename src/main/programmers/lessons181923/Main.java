package main.programmers.lessons181923;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};

        System.out.println(Arrays.toString(sl.solution(arr, queries)));
    }
}
