package main.programmers.lessons181860;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int arr[] = {3,2,4,1,3};
        boolean flag[] = {true, false, true, false, false};
        String result = Arrays.toString(new ArrayList[]{sl.solution(arr, flag)});
        System.out.println(result);
    }
}
