package practice5.io.app;

import java.io.*;
import java.util.Random;

public class TemperatureSensor {
    private static final String FILE_NAME = "sensor.bin";
    private static final int COUNT = 60;

    public static void main(String[] args) throws IOException {
        Random random = new Random();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            for (int i = 0; i < COUNT; i++) {
                double temp = 15.0 + random.nextDouble() * 20.0;
                dos.writeDouble(temp);
            }
        }
        System.out.println("Wrote " + COUNT + " temperatures to " + FILE_NAME);

        try (RandomAccessFile raf = new RandomAccessFile(FILE_NAME, "rw")) {
            raf.seek(29L * 8);
            raf.writeDouble(999.9);
        }
        System.out.println("Patched index 29 with 999.9");

        double sum = 0;
        double max = Double.MIN_VALUE;

        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            for (int i = 0; i < COUNT; i++) {
                double temp = dis.readDouble();
                sum += temp;
                if (temp > max) max = temp;
            }
        }

        double avg = sum / COUNT;
        System.out.printf("Average: %.2f%n", avg);
        System.out.printf("Max: %.2f%n", max);
    }
}
