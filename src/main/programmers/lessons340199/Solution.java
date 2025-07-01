package main.programmers.lessons340199;

public class Solution {
    /**
     * @param wallet
     * @param bill
     * @return
     */
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while (true) {
            if ((bill[0] <= wallet[0] && bill[1] <= wallet[1]) ||
                    (bill[1] <= wallet[0] && bill[0] <= wallet[1])) {
                break;
            }
            if (bill[0] >= bill[1]) {
                bill[0] = Math.floorDiv(bill[0], 2);
            } else {
                bill[1] = Math.floorDiv(bill[1], 2);
            }
            answer++;
        }
        return answer;
    }
}
