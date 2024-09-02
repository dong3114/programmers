package main.programmers.lessons181911;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        String result = sl.solution(my_strings, parts);

        System.out.println(result);
    }
}
