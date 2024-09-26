package main.programmers.lessons181886;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        System.out.println(Arrays.toString(new ArrayList[]{sl.solution(names)}));
    }
}
