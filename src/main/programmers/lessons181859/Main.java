package main.programmers.lessons181859;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {0,1,1,0};
        String result = Arrays.toString(new ArrayList[]{sl.solution(arr)});
        System.out.println(result);
    }
}
