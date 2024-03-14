package step04;
/*
2016년
 */
public class java04_12901 {
    public String solution(int a, int b) {
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int count = 0;
        for(int i = 0; i < a-1; i++) {
            count += month[i];
        }
        count += b;
        return day[count % 7];
    }
}
