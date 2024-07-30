package main.programmers.lssons181950;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String sum = str.repeat(n);
        System.out.println(sum);
    }
}