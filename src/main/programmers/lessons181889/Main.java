package main.programmers.lessons181889;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int[] num_list = {2,1,6};
        int n = 1;

        String result = Arrays.toString(new ArrayList[]{sl.solution(num_list, n)});
        System.out.println(result);
    }
}
