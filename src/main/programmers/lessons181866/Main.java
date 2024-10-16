package main.programmers.lessons181866;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        //axxbxx, abcxabdxabaxabddx, "dxccxbbbxxaaaa, zxcxbxaxxxxxxx
        String myString = "zxcxbxaxxxxxxx";
        System.out.println(Arrays.toString(new ArrayList[]{sl.solution(myString)}));
    }
}
