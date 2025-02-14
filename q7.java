import java.util.Stack;

public class PostfixEvaluator {
    public static int evaluate(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isInteger(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperation(a, b, token);
                stack.push(result);
            }
        }
        return stack.pop(); // القيمة النهائية
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int applyOperation(int a, int b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new UnsupportedOperationException("Unknown operator: " + operator);
        }
    }

    public static void main(String[] args) {
        String expression = "5 2 + 8 3 - 4 /"; // مثال على التعبير postfix
        System.out.println("Result: " + evaluate(expression)); // 1
    }
}