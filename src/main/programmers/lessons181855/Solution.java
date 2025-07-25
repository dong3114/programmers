package main.programmers.lessons181855;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(String str : strArr) {
            int key = str.length();
            if(m.containsKey(key)){
                int count = m.get(key) + 1;
                m.put(key, count);
            } else {
                int count = 1;
                m.put(key, count);
            }
        }
        answer=m.values().stream().mapToInt(Integer::intValue).max().orElse(0);
        return answer;
    }
}
