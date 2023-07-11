package lesson_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задача
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

public class Task_1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();

        System.out.println("Введите числа:");
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Удаление четных чисел
        numbers.removeIf(n -> n % 2 == 0);

        System.out.println("Список чисел после удаления четных чисел:");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
