
// 정렬 - 수 정렬하기2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> input = new ArrayList<>();

        for(int i = 0; i < N; i++){
            input.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(input);

        for(int c: input) {
            sb.append(c).append('\n');
        }

        System.out.println(sb);
    }

    // Arrays.sort()는 primitive arrays에 대해 Dual-Privot Quicksort을 수행
    // 평균 시간 복잡도 - O(nlogn)
    // 최악의 경우 - O(n^2)

    // Collections.sort()는 Object type arrays에 대해 Merge Sort보다 향상된 Tim Sort를 수행
    // Tim sort : 합병정렬의 최악의 경우와 삽입정렬의 최선의 경우를 짬뽕한 알고리즘
    // 시간복잡도 - O(n) ~ O(nlogn)을 보장

    // StringBuilder는 String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의
    // 데이터에 더하는 방식을 사용하기 때문에 속도도 빠르며 상대적으로 부하가 적다.
}
