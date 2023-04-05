// 자료구조 - 균형잡힌 세상

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static String str;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean check = true;

            // str이 .일 경우 프로그램 종료
            if(str.equals(".")) {
                break;
            }

            for (int i = 0; i < str.length(); i++) {
                // ( 또는 [일 경우 stack에 넣어준다
                if(str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                }

                // str이 ')'인 경우
                else if (str.charAt(i) == ')') {
                    if(stack.empty() || stack.peek() != '(') {
                        check = false;
                        break;
                    }else { // 스택에서 ')'를 제거
                        stack.pop();
                    }
                }else if (str.charAt(i) == ']') {   // str이 ']'인 경우
                    if(stack.empty() || stack.peek() != '[') {
                        check = false;
                        break;
                    }else { // 스택에서 ']'를 제거
                        stack.pop();
                    }
                }
            }

            // check가 true이면서 stack이 비었을 경우, yes를 출력
            if(check && stack.empty())
                System.out.println("yes");
            else    // 그렇지 않을 경우 no를 출력
                System.out.println("no");

        }

    }
}
