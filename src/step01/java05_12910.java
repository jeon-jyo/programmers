package step01;
/*
나누어 떨어지는 숫자 배열

array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */
import java.util.*;

public class java05_12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        for (int j : arr) {
            if (j % divisor == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = j;
            }
        }
        if(answer.length == 0) answer = new int[]{-1};
        Arrays.sort(answer);

        return answer;
    }
}

/*
1.
for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length-1] = arr[i];
                num++;
            }
        }

2.
int num = 0;
        for (int j : arr) {
            if (j % divisor == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = j;
                num++;
            }
        }
        if(num == 0) answer = new int[]{-1};
 */