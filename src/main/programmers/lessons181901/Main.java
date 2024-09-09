package main.programmers.lessons181901;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        int n = 10;
        int k = 3;
        ArrayList<Integer> result = sl.solution(n, k);
        System.out.println(Arrays.toString(new ArrayList[]{result}));
    }
}
