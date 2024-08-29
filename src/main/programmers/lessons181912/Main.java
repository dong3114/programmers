package main.programmers.lessons181912;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k = 50000;
        int s = 5;
        int i = 5;

        System.out.println(Arrays.toString(new ArrayList[]{sl.solution(intStrs, k, s, i)}));
    }
}
