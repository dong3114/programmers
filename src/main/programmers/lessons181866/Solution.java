package main.programmers.lessons181866;

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<String> solution(String myString) {
        HashMap<Integer, String> s = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();
        String a = "";
        int n = 0;
        for(int i = 0; i < myString.length(); i++){
            String str = String.valueOf(myString.charAt(i));
            if(str.equals("x")){
                if(!a.isEmpty()) {
                    n = (int) a.charAt(0);
                    s.put(n, a);
                    a = "";
                }
            } else {
                a += str;
            }
        }
        if(!a.equals("")){
            n = (int) a.charAt(0);
            s.put(n, a);
        }
        answer.addAll(s.values());
        return answer;
    }
}