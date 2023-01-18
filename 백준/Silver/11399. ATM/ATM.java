import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 그리디 알고리즘 - ATM

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());   // 사람의 수 N 입력 받기
        int[] input = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < N; i++) {
            input[i] =Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        int sum = 0;
        int prev = 0;
        for(int i = 0; i < N; i++) {
            prev += input[i];
            sum += prev;
        }
        System.out.println(sum);
    }
}
