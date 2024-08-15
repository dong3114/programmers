package main.programmers.lessons181930;

import java.util.ArrayList;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        ArrayList<Integer> same = new ArrayList<>();
        same.add(0, a);
        same.add(1, b);
        same.add(2, c);
        for(int i = 0; i < same.size() - 1; i++){
            if(same.get(i).equals(same.get(i+1))){
                int num = same.get(i);
                same.set(i, same.get(i+1));
                same.set(i+1, num);
            }
        }
        if(same.get(0).equals(same.get(2))){
            int idx0 = same.get(0);
            int idx1 = same.get(1);
            same.set(0, same.get(2));
            same.set(1, idx0);
            same.set(2, idx1);
        } else if(same.get(1).equals(same.get(2))){
            int idx0 = same.get(0);
            int idx1 = same.get(1);
            int idx2 = same.get(2);
            same.set(0, idx1);
            same.set(1, idx2);
            same.set(2, idx0);
        }
        int idx0 = same.get(0);
        int idx1 = same.get(1);
        int idx2 = same.get(2);

        if(idx0 != idx1) {
            answer = idx0 + idx1 + idx2;
        } else if(idx0 == idx1 && idx1 == idx2){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        } else {
            answer = (a+b+c)*(a*a+b*b+c*c);
        }

        return answer;
    }
}