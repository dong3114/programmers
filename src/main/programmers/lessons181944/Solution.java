package main.programmers.lessons181944;

import java.util.Scanner;

/**
 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을,
 * 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
 * 100 is even, 1 is odd
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println(n + " is odd");
        } else if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + "음수는 해당 사항이 없습니다.");
        }
    }
}