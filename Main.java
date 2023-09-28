import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Введите числа первого списка (через пробел):");
        String[] input1 = scanner.nextLine().split(" ");
        for (String s : input1) {
            list1.add(Integer.parseInt(s));
        }

        System.out.println("Введите числа второго списка (через пробел):");
        String[] input2 = scanner.nextLine().split(" ");
        for (String s : input2) {
            list2.add(Integer.parseInt(s));
        }

        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            System.out.println("Первый список имеет большее среднее значение");
        } else if (average1 < average2) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения равны");
        }
    }

    public static double calculateAverage(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return (double) sum / list.size();
    }
}
