package lesson_4;
import java.util.ArrayList;
import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {

        /*
        Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
         */

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);

        System.out.println(numbers);

        ArrayList<Integer> reversedNumbers = reverseList(numbers);
        System.out.println(reversedNumbers);

    }

    public static ArrayList<Integer> reverseList(LinkedList<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;

    }
}
