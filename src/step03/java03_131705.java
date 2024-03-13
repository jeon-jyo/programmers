package step03;
/*
크기가 작은 부분 문자열

숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.

예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
 */
public class java03_131705 {
    public int solution(String t, String p) {
        Long num = Long.parseLong(p);
        int answer = 0;
        for(int i = 0; i <= t.length()-p.length(); i++) {
            Long no = Long.parseLong(t.substring(i, i+p.length()));
            if (no <= num) answer++;
        }
        return answer;
    }
}

/*
팀코드
1.
class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        int st = 0;
        int ed = p.length();

        String subT = "";

        while(ed <= t.length()){

            subT = t.substring(st,ed);

            if(isBigOrSame(subT, p)){
                answer++;
            }
            st++;
            ed++;
        }

        return answer;
    }

    public boolean isBigOrSame(String stand, String target){
        for(int i = 0; i < stand.length(); i++){
            if(stand.charAt(i) < target.charAt(i)){
                return true;
            } else if (stand.charAt(i) > target.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
 */