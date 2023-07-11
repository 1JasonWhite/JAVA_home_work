package lesson_4;

import java.util.LinkedList;

public class Task_3 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);

        System.out.println(numbers);

        int sum = sumLinkedList(numbers);
        System.out.println("Сумма: " + sum);
    }

    public static int sumLinkedList(LinkedList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;

    }
}
