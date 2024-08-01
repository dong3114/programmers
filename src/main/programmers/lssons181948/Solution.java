package main.programmers.lssons181948;

import java.util.Scanner;

//특수문자 출력
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String simbol = "!@#$%^&*(\\'\"<>?:;\n";
        String str = sc.next();
        if (str.length() > 0) {
            str = simbol;
            System.out.println(str);
            return;
        }
        System.out.println(str);
    }
}