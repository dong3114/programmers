package main.programmers.lessons181858;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {0,1,1,2,2,3};
        int k = 3;
        String result = Arrays.toString(new ArrayList[]{sl.solution(arr, k)});
        System.out.println(result);
    }
}
