package main.programmers.lssons181949;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();
        String a = sc.next();
        String str = a.toUpperCase();
        for(int i = 0; i < a.length(); i++) {
            //@params=big"a에서 대문자인 경우 찾기위한 변수"
            String big = a.substring(i, i+1);
            String scan = str.substring(i, i+1);
            if(big.equals(scan)) {
                big = big.toLowerCase();
                array.add(big);
            } else {
                big = big.toUpperCase();
                array.add(big);
            }
        }
        String sum = String.join("", array);
        System.out.println(sum);
    }
}
