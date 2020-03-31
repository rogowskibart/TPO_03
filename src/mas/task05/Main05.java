package mas.task05;

import java.util.Random;

public class Main05 {
    public static void main(String[] args) {
        final int LOWEST_NUMBER = 0;
        final int HIGHEST_NUMBER = 25;
        final int NUMBER_OF_ELEMENTS = 10;
        int[] elements = new int[NUMBER_OF_ELEMENTS];
        Random random = new Random();

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            elements[i] = random.nextInt(HIGHEST_NUMBER - LOWEST_NUMBER) + LOWEST_NUMBER;
        }

        for (int element : elements) {
            System.out.print(element + ", ");
        }
        System.out.println();

        int lowestIndex = findLowestIndex(elements);
        int highestIndex = findHighestIndex(elements);

        System.out.println("Lowest number is " + elements[lowestIndex]);
        System.out.println("Highest number is " + elements[highestIndex]);
    }

    private static int findLowestIndex(int[] elements) {
        int lowestIndex = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < elements[lowestIndex]) {
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    private static int findHighestIndex(int[] elements) {
        int highestIndex = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > elements[highestIndex]) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }
}
