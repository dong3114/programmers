package main.programmers.upgrade;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
public class Main {
    public static void main(String[] args){
        HashMap<Integer, Map<Integer, Integer>> probability = new HashMap<>();
        boolean rogicKey = true;
        int i = 0;
        Scanner sc = new Scanner(System.in);

        // 확률인 force는 0 ~ 80 까지 올라감
        while (rogicKey){
            System.out.println("강화 확률 계산 시작합니다");
            System.out.println("| 1. 확률입력       2. 확률실행      3. 종료 |");
            int inputNum = Integer.parseInt(sc.next());

            switch(inputNum) {
                case 1:
                    // 강화 확률 up i -> i+1로 갈 확률
                    int index = i;
                    System.out.println("입력할 강화 확률");
                    int force = Integer.parseInt(sc.next());
                    System.out.println("가격");
                    int price = Integer.parseInt(sc.next());
                    probability.putIfAbsent(index, new HashMap<>());
                    probability.get(index).put(force, price);
                    i++;
                    break;
                case 2:
                    Rogic r = new Rogic();
                    r.rogic(probability);
                    break;
                case 3:
                    System.out.println(probability);
                    System.out.println("종료합니다.");
                    rogicKey = false;
                    break;
            }
        }

        sc.close();
    }
}
 */
