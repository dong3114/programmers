package main.programmers.lessons181916;

import java.util.ArrayList;
import java.util.Collections;

/**
 * result.size = 무조건 "3" 보다 작거나 같음
 * 모두 같을때 {같은 수, 같은 수, 같은 수}
 * 3개가 같고 하나가 다를때 {같은 수, 같은 수, 다른 수}
 * 2개씩 같을때 {같은 수1, 같은 수2}
 * 1개는 같고 나머지 다를때 {같은 수, 다른 수1, 다른 수2}
 * 나머지 모두 다를때 number 배열 return
 */
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int x = 0;
        int y = 0;
        int same = 0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> number = new ArrayList<>();
        number.add(a);
        number.add(b);
        number.add(c);
        number.add(d);
        Collections.sort(number);

        for(int i = 0; i < number.size() - 1; i++){
            x = number.get(i);
            y = number.get(i+1);

            if(x == y){
                result.add(x);
                number.set(i, y);
                number.set(i+1, x);
                ++same;
            }
        }
        if(same == 3){
            answer = a * 1111;
        } else if(same == 2 && result.get(0) == result.get(1)){
            number.removeIf(n -> n.equals(result.get(0)));
            answer = (int) Math.pow((10 * result.get(0) + number.get(0)), 2);
        } else if(same == 2 && result.get(0) != result.get(1)){
            answer = (result.get(0) + result.get(1)) * (result.get(1) - result.get(0));
        } else if(same == 1){
            number.removeIf(n -> n.equals(result.get(0)));
            answer = number.get(0) * number.get(1);
        } else if(same == 0){
            answer = number.get(0);
        }
        return answer;
    }
}