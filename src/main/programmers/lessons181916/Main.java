package main.programmers.lessons181916;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(sl.solution(a,b,c,d));
    }
}
