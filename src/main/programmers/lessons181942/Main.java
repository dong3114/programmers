package main.programmers.lessons181942;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Solution sl = new Solution();
        String answer = sl.solution(a, b);

        System.out.println(answer);
    }
}
