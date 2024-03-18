package step06;
/*
개인정보 수집 유효기간
 */
import java.util.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
public class java01_150370 {
    public static void main(String[] args) {
        String today = "2020.01.01";
        String[] terms = {"Z 3", "D 6"};
        String[] privacies = {"2019.06.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        System.out.println(Arrays.toString(solution(today, terms, privacies)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        String[] str = today.split("\\.");
        int[] todayList = {Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] s = privacies[i].split(" ")[0].split("\\.");
            int[] date = {Integer.parseInt(s[0]), Integer.parseInt(s[1]), Integer.parseInt(s[2])};
            String privacy = privacies[i].split(" ")[1];

            for (int j = 0; j < terms.length; j++) {
                String kind = terms[j].split(" ")[0];

                if (privacy.equals(kind)) {
                    int term = Integer.parseInt(terms[j].split(" ")[1]);
                    int year = date[0]+(date[1]+term-1)/12;
                    int month = (date[1]+term-1)%12+1;

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
int[] todayList = new int[] {Integer.parseInt(today.split("\\.")[0]), Integer.parseInt(today.split("\\.")[1]), Integer.parseInt(today.split("\\.")[2])};
int[] date = new int[] {Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[0]), Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[1]), Integer.parseInt(privacies[i].split(" ")[0].split("\\.")[2])};

2.
String[] str = new String[] {today.split("\\.")[0], today.split("\\.")[1], today.split("\\.")[2]};
int[] todayList = new int[] {Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])};
 */