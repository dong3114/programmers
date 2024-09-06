package main.programmers.lessons181902;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        String my_string = "Programmers";
        ArrayList<Integer> result = sl.solution(my_string);

        System.out.println(Arrays.toString(new ArrayList[]{result}));
    }
}
