package lesson_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        /*
        Реализовать простой калькулятор
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Представьтесь: ");
        String name = scanner.nextLine();
        System.out.println("Здравствуйте, " + name);

        System.out.println(name + ", введите первую цифру");
        System.out.printf("первая цифра: ");
        Scanner iScanner = new Scanner(System.in);
        int number1 = iScanner.nextInt();
        System.out.println(name + " ты ввел первую цифру: " + number1);

        System.out.println("Введите вторую цифру");
        System.out.printf("вторая цифра: ");
        int number2 = iScanner.nextInt();
        System.out.println(name + " ты ввел вторую цифру: " + number2);

        int plus = number1 + number2;
        System.out.println("Сложение: " + number1 + " + " + number2 + " = " + plus);

        int two = number1 - number2;
        System.out.println("Вычитание: " + number1 + " - " + number2 + " = " + two);

        int three = number1 * number2;
        System.out.println("Умножение: " + number1 + " * " + number2 + " = " + three);

        System.out.println("Деление: " + number1 + " / " + number2 + " = " + number1/number2);






    }
}
