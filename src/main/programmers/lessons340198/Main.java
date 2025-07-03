package main.programmers.lessons340198;

public class Main {
    public static void main(String[] args){
        int[] mats = {5,3,2};
        String[][] park = {
                            {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                            {"A", "A", "-1", "B", "B", "B", "B", "-1"},
                            {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"},
                            {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"},
                            {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"},
                            {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};
        Solution sl = new Solution();
        System.out.println(sl.solution(mats, park));
    }

}
