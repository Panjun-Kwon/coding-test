package programmers.level_1;

public class No_12903 {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split("");
        if(arr.length % 2 == 1) {
            answer += arr[arr.length / 2];
        } else {
            answer += arr[arr.length / 2 - 1] + arr[arr.length / 2];
        }

        return answer;
    }
}
