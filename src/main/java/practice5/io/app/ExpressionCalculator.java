package practice5.io.app;

import practice5.io.util.ExpressionAnalyzer;

import java.io.*;
import java.util.NoSuchElementException;

public class ExpressionCalculator {
    public static void main(String[] args) {
        String inputFile = "expressions.txt";
        ExpressionAnalyzer analyzer = new ExpressionAnalyzer();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter results = new PrintWriter(new FileWriter("results.txt"));
             PrintWriter log = new PrintWriter(new FileWriter("log.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                try {
                    double result = analyzer.evaluate(line);
                    results.println(line + " = " + result);
                } catch (NoSuchElementException e) {
                    log.println("ERROR [missing operand]: " + line);
                } catch (NumberFormatException e) {
                    log.println("ERROR [invalid number]: " + line);
                } catch (UnsupportedOperationException e) {
                    log.println("ERROR [unsupported operator]: " + line);
                } catch (ArithmeticException e) {
                    log.println("ERROR [arithmetic]: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        System.out.println("Done. See results.txt and log.txt");
    }
}
