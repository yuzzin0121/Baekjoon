
// 정렬 - 좌표 압축

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];	// 원본 배열
        int[] sorted = new int[N];	// 정렬 할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();	// HashMap을 사용해서 랭킹을 매길것이다

        // 띄어쓰기를 기준으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            // 정렬할 배열과 원본 배열에 값을 넣어준다.
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        // sorted 배열에 대해 정렬
        Arrays.sort(sorted);


        // 정렬 된 배열을 순회하면서 map에 넣어준다.
        int rank = 0;
        for(int s : sorted) {
            // 원소가 중복되지 않은 경우에만 map의 원소와 그에 대응되는 순위를 넣어준다
            if(!rankingMap.containsKey(s)) {
                rankingMap.put(s, rank);
                rank++;		// map에 넣고나면 다음 순위를 가리킬 수 있도록 1을 더해준다.
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key : origin) {
            int ranking = rankingMap.get(key);	// 원본 배열 원소(key)에 대한 value(순위)를 가져온다!
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
    }
}
