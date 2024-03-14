package step04;
/*
콜라 문제
 */
public class java02_132267 {
    public static void main(String[] args) {
        System.out.println(solution(3,1,20));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            answer += (n/a) * b;
            n = (n%a) + ((n/a) * b);
        }
        return answer;
    }
}
