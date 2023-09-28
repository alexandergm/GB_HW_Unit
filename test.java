import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class test {

    @Test
    public void testCalculateAverage() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        assertEquals(2.0, Main.calculateAverage(list1), 0.001);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        assertEquals(20.0, Main.calculateAverage(list2), 0.001);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(-5);
        list3.add(0);
        list3.add(5);
        assertEquals(0.0, Main.calculateAverage(list3), 0.001);
    }

    @Test
    public void testMain() {
        // Test case 1: average of first list is greater
        String input1 = "1 10 15";
        String input2 = "4 5 6";
        String expectedOutput = "Первый список имеет большее среднее значение";
        assertEquals(expectedOutput, getOutput(input1, input2));

        // Test case 2: average of second list is greater
        input1 = "10 20 30";
        input2 = "40 50 60";
        expectedOutput = "Второй список имеет большее среднее значение";
        assertEquals(expectedOutput, getOutput(input1, input2));

        // Test case 3: both lists have equal averages
        input1 = "25 30 20";
        input2 = "20 25 30";
        expectedOutput = "Средние значения равны";
        assertEquals(expectedOutput, getOutput(input1, input2));
    }

    private String getOutput(String input1, String input2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (String s : input1.split(" ")) {
            list1.add(Integer.parseInt(s));
        }

        for (String s : input2.split(" ")) {
            list2.add(Integer.parseInt(s));
        }

        double average1 = Main.calculateAverage(list1);
        double average2 = Main.calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
