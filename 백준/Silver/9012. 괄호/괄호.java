import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] input = new String[51];

        for(int i = 0; i < N; i++){
            sb.append(isVPS(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }
    static String isVPS(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(stack.isEmpty())
                return "NO";
            else
                stack.pop();
        }

        if(stack.isEmpty())
            return "YES";
        else
            return "NO";
    }
}
