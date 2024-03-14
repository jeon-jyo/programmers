package step04;
/*
카드 뭉치
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java05_159994 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"i", "water", "drink"}, new String[] {"want", "to"},
                new String[] {"i", "want", "to", "drink", "water"}));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> arr1 = new ArrayList<>(Arrays.asList(cards1));
        List<String> arr2 = new ArrayList<>(Arrays.asList(cards2));
        String answer = "Yes";
        for (String s : goal) {
            if (arr1.size() != 0 && s.equals(arr1.get(0))) {
                arr1.remove(0);
            } else if (arr2.size() != 0 && s.equals(arr2.get(0))) {
                arr2.remove(0);
            } else {
                answer = "No";
            }
        }
        return answer;
    }
}
