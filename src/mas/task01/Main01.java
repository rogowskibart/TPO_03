package mas.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main01 {
    public static void main(String[] args) {
        // static number of integers
        final int NUMBER_OF_INTEGERS = 15;
        Random random = new Random();

        Integer[] integers = new Integer[NUMBER_OF_INTEGERS];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(100);
        }

        for (Integer integer : integers) {
            System.out.print(integer + ", ");
        }

        // variable number of integers
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_INTEGERS; i++) {
            integerList.add(random.nextInt(100));
        }

        for (Integer integer : integerList) {
            System.out.println(integer + ", ");
        }
    }

}
