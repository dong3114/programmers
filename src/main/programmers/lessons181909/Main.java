package main.programmers.lessons181909;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        String my_string = "banana";
        String s = Arrays.toString(new ArrayList[]{sl.solution(my_string)});

        System.out.println(s);
    }
}
