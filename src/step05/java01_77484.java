package step05;
/*
로또의 최고 순위와 최저 순위
 */
public class java01_77484 {
    public static void main(String[] args) {
        int[] result = solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19});
        for(int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero = 0;
        for(int lotto : lottos){
            if(lotto == 0 ) {
                zero++;
            }
            for(int win_num : win_nums){
                if(lotto == win_num){
                    cnt++;
                }
            }
        }
        answer[0] = Math.min(6,7-zero-cnt);
        answer[1] = Math.min(6,7-cnt);
        return answer;
    }
}
