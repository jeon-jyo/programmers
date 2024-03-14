package step04;
/*
명예의 전당 (1)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class java03_138477 {
    public static void main(String[] args) {
        int[] result = solution(4, new int[] {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
        for(int i : result) {
            System.out.print(i + " ");
        }
        // 0, 0, 0, 0, 20, 40, 70, 70, 150, 300
    }

    public static int[] solution(int k, int[] score) {
        List<Integer> arr = new ArrayList<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            arr.add(score[i]);
            Collections.sort(arr);
            answer[i] = arr.get(i >= k ? arr.size()-k : 0);
        }
        return answer;
    }
}
