// 자료구조 - 카드2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        // 카드들 큐에 넣기
        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }


        while(q.size() > 1) {
            q.poll();	// 맨 앞의 원소 버리고,
            q.offer(q.poll());	// 맨 앞의 원소를 버림과 동시에 버려진 원소를 맨 뒤에 삽입하기
        }

        System.out.println(q.poll());	// 마지막으로 남은 원소를 출력
    }
}
