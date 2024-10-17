package main.programmers.lessons181865;

import java.util.ArrayList;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String s = "";
        String n = "";
        ArrayList<Integer> number = new ArrayList<>();

        for(int i = 0; i < binomial.length(); i++){
            if(String.valueOf(binomial.charAt(i)).equals("+") ||
                    String.valueOf(binomial.charAt(i)).equals("-") ||
                    String.valueOf(binomial.charAt(i)).equals("*")){
                s = String.valueOf(binomial.charAt(i));
                number.add(Integer.parseInt(n.trim()));
                n = "";
            } else {
                n += String.valueOf(binomial.charAt(i));
            }
        }
        number.add(Integer.parseInt(n.trim()));
        switch (s){
            case "+":
                answer = number.get(0) + number.get(1);
                break;
            case "-":
                answer = number.get(0) - number.get(1);
                break;
            case "*":
                answer = number.get(0) * number.get(1);
                break;
        }
        return answer;
    }
}