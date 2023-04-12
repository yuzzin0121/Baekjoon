// 자료구조 - 최소 힙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int x;
        PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>();

        for(int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());

            if(x == 0) {
                if(!minQueue.isEmpty()) {
                    System.out.println(minQueue.poll());
                }
                else {
                    System.out.println(0);
                }
            }
            else if (x > 0) {
                minQueue.add(x);
            }
        }

    }
}
