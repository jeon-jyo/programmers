package step03;
/*
시저 암호

어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다.
"z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
 */
public class java05_12926 {
    public static void main(String[] args) {
        System.out.println(solution("z Z",1));
    }

    public static String solution(String s, int n) {
        char[] arr = s.toCharArray();
        String answer = "";
        for(char a : arr) {
            if(a == ' ') {
                answer += a;
            } else if (Character.isUpperCase(a)) {
                if(a+n > 'Z') {
                    answer += (char)(a - 26 + n);
                }  else {
                    answer += (char)(a + n);
                }
            } else {
                if(a+n > 'z') {
                    answer += (char)(a - 26 + n);
                }  else {
                    answer += (char)(a + n);
                }
            }
        }
        return answer;
    }
}

/*
팀코드
1.
public String solution(String s, int n) {
      StringBuilder answer = new StringBuilder();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ((ch - 'A' + n) % 26 + 'A'); // 대문자 처리
            } else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ((ch - 'a' + n) % 26 + 'a'); // 소문자 처리
            }

            answer.append(ch);
        }

        return answer.toString();
    }
 */