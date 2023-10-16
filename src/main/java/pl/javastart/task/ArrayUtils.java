package pl.javastart.task;

import java.util.Locale;
import java.util.Scanner;

public class ArrayUtils {

    private Scanner scanner = new Scanner(System.in);

    public double[] arrayBuild() {
        System.out.println("Podaj rozmiar tablicy: ");
        scanner.useLocale(Locale.UK);
        int size = scanner.nextInt();
        double[] array = new double[size];
        if (size == 1) {
            System.out.println("Wprowadź " + size + " liczbę");
        } else if (size >= 5) {
            System.out.println("Wprowadź " + size + " liczb");
        } else {
            System.out.println("Wprowadź " + size + " liczby");
        }
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }

    public double sumSquare(double[] array) {
        double squareSum = 0;
        for (double value : array) {
            squareSum += Math.pow(value, 2);
        }
        return squareSum;
    }

}
