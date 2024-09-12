package main.programmers.lessons181894;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {1,2,1,4,5,2,9};
        ArrayList<Integer> result = sl.solution(arr);

        System.out.println(Arrays.toString(new ArrayList[]{result}));
    }
}
