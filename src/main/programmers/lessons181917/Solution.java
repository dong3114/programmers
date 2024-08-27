package main.programmers.lessons181917;

class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x = true;
        boolean y = true;
        x = logic1(x1, x2);
        y = logic1(x3, x4);

        return answer = logic2(x, y);
    }

    public static boolean logic1(boolean x, boolean y){
        boolean result = true;
        if(x == false && y == false){
            result = false;
        } else{
            result = true;
        }
        return result;
    }
    public static boolean logic2(boolean x, boolean y){
        boolean result = true;
        if(x == true && y == true){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}