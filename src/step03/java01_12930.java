package step03;
/*
이상한 문자 만들기

문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 */
public class java01_12930 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strList = s.split("");
        int index = 0;
        for (String str : strList) {
            if (str.equals(" ")) {
                sb.append(" ");
                index = 0;
            } else if (index % 2 == 0) {
                sb.append(str.toUpperCase());
                index++;
            } else {
                sb.append(str.toLowerCase());
                index++;
            }
        }
        return sb.toString();
    }
}

/*
1. 시간초과
String[] strList = s.split(" ");
        String answer = "";
        for (int i = 0; i < strList.length; i++) {
            String[] str = strList[i].split("");
            for (int j = 0; j < str.length; i++) {
                if (j % 2 == 0)
                    answer += str[j].toUpperCase();
                else
                    answer += str[j].toLowerCase();
            }
            answer += " ";
        }

        return answer;
 */