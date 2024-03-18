package step06;
/*
최댓값과 최솟값
 */
import java.util.Arrays;

public class java05_12939 {
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
    }
    public static String solution(String s) {
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(num);
        return num[0] + " " + num[num.length-1];
    }
}

/*
팀코드
1.
import java.util.Arrays;
class Solution {
    public static String solution(String s){
        String[] numbers = s.split(" ");
        int[] answer = Arrays.stream(numbers).mapToInt(Integer::parseInt).sorted().toArray();
        return answer[0] + " " + answer[answer.length-1];
    }
}
 */