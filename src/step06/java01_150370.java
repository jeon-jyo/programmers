package step06;
/*
개인정보 수집 유효기간
 */
import java.util.*;

public class java01_150370 {
    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 5"};
        String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] todayList = new int[] {Integer.parseInt(today.split("\\.")[0]), Integer.parseInt(today.split("\\.")[1]), Integer.parseInt(today.split("\\.")[2])};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            int[] date = new int[] {Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[0]), Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[1]), Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[2])};
            String privacy = privacies[i].split(" ")[1];
            System.out.println(Arrays.toString(date));

            for (int j = 0; j < terms.length; j++) {
                String kind = terms[j].split(" ")[0];

                if (privacy.equals(kind)) {
                    int term = Integer.parseInt(terms[j].split(" ")[1]);
                    int year = date[0]+(date[1]+term)/12;
                    int month = (date[1]+term)%12;

                    if (year < todayList[0]) {
                        list.add(i+1);
                    } else if (year == todayList[0] && month < todayList[1]) {
                        list.add(i+1);
                    } else if (year == todayList[0] && month == todayList[1] && date[2] <= todayList[2]) {
                        list.add(i+1);
                    }
                }
            }
        }
        Collections.sort(list);

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

/*
1.
int[] answer = list.stream().mapToInt(i->i).toArray();
 */