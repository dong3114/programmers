package main.programmers.lessons250125;

public class Main {
    public static void main(String[] args){
        String[][] board =  {{"blue", "red", "orange", "red"},
                            {"red", "red", "blue", "orange"},
                            {"blue", "orange", "red", "red"},
                            {"orange", "orange", "red", "blue"}};
        int h=1, w=1;
        Solution sl = new Solution();
        int result = sl.solution(board,h,w);
        System.out.println(result);
    }
}
