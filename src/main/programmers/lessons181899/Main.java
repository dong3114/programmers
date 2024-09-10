package main.programmers.lessons181899;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int start_num = 10;
        int end_num = 3;
        ArrayList<Integer> result = sl.solution(start_num, end_num);

        System.out.println(Arrays.toString(new ArrayList[]{result}));
    }
}
