package main.programmers.lessons181893;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};

        ArrayList<Integer> result = sl.solution(arr, query);
        System.out.println(Arrays.toString(new ArrayList[]{result}));
    }
}
