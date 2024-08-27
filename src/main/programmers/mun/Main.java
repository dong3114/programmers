package main.programmers.mun;

public class Main {
    public static void main(String[] args){
        Solution sl = new Solution();
        String[][] s = {{"blue", "red", "orange", "yellow"}, {"red", "red", "blue", "orange"}, {"orange","orange","orange","orange"},{"orange","orange","orange","orange"}};

        System.out.println(sl.solution(s, 1,1));
    }
}
