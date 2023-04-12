
// 깊이우선탐색 - 연결 요소의 개수

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int answer = 0;
    static int[][] array;
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1];
        array = new int[N + 1][N + 1];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            array[u][v] = 1;
            array[v][u] = 1;
        }

        answer = 0;
        for(int i = 1; i < array.length; i++) {
            if(visited[i] == false){
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }

    private static void dfs(int x){
        if(visited[x] == true) {
            return;
        } else {
            visited[x] = true;
        }

        for(int i = 1; i < array.length; i++) {
            if(array[x][i] == 1 && visited[i] != true) {
                dfs(i);
            }
        }
    }
}
