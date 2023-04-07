

// 이분탐색 - 두 용액

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] input = new int[N];	// 원본 배열
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);

        int i = 0;
        int j = input.length - 1;
        
        int gap = Integer.MAX_VALUE;
        int answer1 = 0;
        int answer2 = 0;
        
        int temp;   // sum의 절댓값을 저장할 변수
        int sum;
        
        while(i < j) {
            sum = input[i] + input[j];
            temp = Math.abs(sum);
            if(temp < gap) {   // 두 용액 특성값의 합을 gap과 비교
                gap = temp;
                answer1 = input[i];
                answer2 = input[j];
            }
            if(sum > 0)
                j--;
            else
                i++;
        }
        System.out.println(answer1 + " " + answer2);
    }
}
