package practice5.io.app;

import practice5.io.util.WordFrequencyAnalyzer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        WordFrequencyAnalyzer analyzer = new WordFrequencyAnalyzer();
        Map<String, Integer> wordCount;

        try {
            wordCount = analyzer.analyze("input.txt");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        try (PrintWriter writer = new PrintWriter("report.txt")) {
            wordCount.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(e -> writer.println(e.getKey() + ": " + e.getValue()));
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        System.out.println("Done. Results written to report.txt");
    }
}
