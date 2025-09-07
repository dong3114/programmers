package main.programmers.lessons92334;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo",
                            "apeach frodo",
                            "frodo neo",
                            "muzi neo",
                            "apeach muzi"};
        int k = 2;
        Solution sl = new Solution();
        ArrayList<Integer> result = sl.solution(id_list, report, k);

        System.out.println(Arrays.toString(new ArrayList[]{result}));
    }
}
