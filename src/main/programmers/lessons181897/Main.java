package main.programmers.lessons181897;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int n = 3;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1,2,3,4,5,6,7,8,9};

        ArrayList<Integer> result = sl.solution(n, slicer, num_list);
        System.out.println(Arrays.toString(new ArrayList[]{result}));
    }
}
