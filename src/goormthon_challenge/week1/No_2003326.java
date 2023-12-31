package goormthon_challenge.week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 완벽한 햄버거 만들기
 */
public class No_2003326 {
    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 재료의 개수

        int[] k = new int[N]; // 각 재료의 맛
        for (int i = 0; i < N; i++) {
            k[i] = scanner.nextInt();
        }

        int result = 0; // 햄버거의 맛
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            result += k[i];

            if(i == 0) {
                continue;
            }

            if(flag) { // 햄버거 검증
                if(k[i-1] > k[i]) {
                    flag = false;
                }
            } else {
                if(k[i-1] < k[i]) {
                    System.out.println(0);
                    return;
                }
            }
        }

        System.out.println(result);
    }
}

class Answer_2003326 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력을 받기 위해 Scanner 객체 생성

        // N 입력 받기
        int n = Integer.parseInt(sc.nextLine());

        // 배열 입력 받기
        String[] arrStr = sc.nextLine().split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (String s : arrStr) {
            arr.add(Integer.parseInt(s));
        }

        // 최대값과 그 인덱스 찾기
        int maxIndex = arr.indexOf(Collections.max(arr));

        // 좌측 리스트와 우측 리스트 생성
        ArrayList<Integer> left = new ArrayList<>(arr.subList(0, maxIndex));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(maxIndex, n));

        // 좌측 리스트는 오름차순, 우측 리스트는 내림차순으로 정렬
        Collections.sort(left);
        Collections.sort(right, Collections.reverseOrder());

        // 좌측 리스트와 우측 리스트 합치기
        ArrayList<Integer> sortedArr = new ArrayList<>();
        sortedArr.addAll(left);
        sortedArr.addAll(right);

        // 리스트 비교 후 결과 출력
        if (sortedArr.equals(arr)) {
            int sum = sortedArr.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum);
        } else {
            System.out.println(0);
        }
    }
}
