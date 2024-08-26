package main.programmers.lessons181922;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,1}, {0,3,2}, {0,3,3}};
        System.out.println(Arrays.toString(sl.solution(arr, queries)));
    }
}
