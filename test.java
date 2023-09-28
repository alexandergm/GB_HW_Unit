import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class test {
    @Test
    public void testCalculateAverage() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        double result = Main.calculateAverage(list);
        Assertions.assertEquals(4.0, result);
    }

    @Test
    public void testMain() {
        String input1 = "1 2 3";
        String input2 = "4 5 6";
        String expectedOutput = "Второй список имеет большее среднее значение";
        TestHelper.testMain(input1, input2, expectedOutput);

        input1 = "10 20 30";
        input2 = "40 50 60";
        expectedOutput = "Второй список имеет большее среднее значение";
        TestHelper.testMain(input1, input2, expectedOutput);

        input1 = "1 2 3";
        input2 = "1 2 3";
        expectedOutput = "Средние значения равны";
        TestHelper.testMain(input1, input2, expectedOutput);

        input1 = "1 2 3";
        input2 = "3 2 1";
        expectedOutput = "Средние значения равны";
        TestHelper.testMain(input1, input2, expectedOutput);

        input1 = "5";
        input2 = "10";
        expectedOutput = "Второй список имеет большее среднее значение";
        TestHelper.testMain(input1, input2, expectedOutput);
    }
}

class TestHelper {
    static void testMain(String input1, String input2, String expectedOutput) {
        java.io.ByteArrayInputStream in = new java.io.ByteArrayInputStream(input1.getBytes());
        System.setIn(in);

        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        in = new java.io.ByteArrayInputStream(input2.getBytes());
        System.setIn(in);

        Main.main(new String[]{});

        Assertions.assertEquals(expectedOutput, out.toString().trim());
    }
}
