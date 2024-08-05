package main.programmers.lessons181943;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a = "";
        String b = "";
        int c = 0;

        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        c = sc.nextInt();

        Solution sl = new Solution();
        String word = sl.solution(a, b, c);
        System.out.println(word);
    }
}
