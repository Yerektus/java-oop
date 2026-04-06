package practice5.io.util;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExpressionAnalyzer {

    public double evaluate(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

        if (!tokenizer.hasMoreTokens()) throw new NoSuchElementException("Missing operand");
        String tok1 = tokenizer.nextToken().trim();
        double operand1 = Double.parseDouble(tok1);

        if (!tokenizer.hasMoreTokens()) throw new NoSuchElementException("Missing operator");
        String operator = tokenizer.nextToken().trim();

        if (!tokenizer.hasMoreTokens()) throw new NoSuchElementException("Missing second operand");
        String tok2 = tokenizer.nextToken().trim();
        double operand2 = Double.parseDouble(tok2);

        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> {
                if (operand2 == 0) throw new ArithmeticException("Division by zero");
                yield operand1 / operand2;
            }
            default -> throw new UnsupportedOperationException("Unknown operator: " + operator);
        };
    }
}
