package solidprinciples;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "2[abc]3[cd]ef";
        String output = decodeString(s);
        System.out.println(output);
    }

    private static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currentResult = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(count);
                resultStack.push(currentResult);
                count = 0;
                currentResult = new StringBuilder();
            } else if (ch == ']') {
                int currentCount = countStack.pop();
                StringBuilder prevResult = resultStack.pop();
                for (int i = 0; i < currentCount; i++) {
                    prevResult.append(currentResult);
                }
                currentResult = prevResult;
            } else {
                currentResult.append(ch);
            }
        }

        return currentResult.toString();
    }
}
