package step04;
/*
푸드 파이트 대회
 */
public class java01_134240 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 7, 1, 2}));
    }

    public static String solution(int[] food) {
        String answer = "";
        for (int i = 1; i < food.length; i++) {
            answer += Integer.toString(i).repeat(food[i]/2);
        }
        StringBuilder sb = new StringBuilder(answer);
        return answer + "0" + sb.reverse();
    }
}

/*
1.
StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            sb.append(Integer.toString(i).repeat(food[i]/2));
        }
        sb.append("0");
        for (int i = food.length-1; i >= 1; i--) {
            sb.append(Integer.toString(i).repeat(food[i]/2));
        }
        return sb.toString();
 */