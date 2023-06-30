package lesson_1;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class task_3 {
    public static void main(String[] args) {

//        int n = 5; // Заданное значение n
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Write the number: ");
        int n = iScanner.nextInt();

        long factorial = calculateFactorial(n);

        System.out.println("Факториал " + n + " равен " + factorial);
    }

    private static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

}



