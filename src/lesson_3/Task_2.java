package lesson_3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Task_2 {
    public static void main(String[] args) {

        /*
        Задача
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое
        из этого списка. Collections.max()
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел:");
        int count = scanner.nextInt();

        System.out.println("Введите числа:");
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            numbers.add(number);


        }
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = sum / numbers.size();


        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднеарифметическое число: " + average);
    }
}

