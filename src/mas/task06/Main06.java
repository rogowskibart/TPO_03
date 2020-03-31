package mas.task06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main06 {
    public static void main(String[] args) {
        // static number of prisms
        final int NUMBER_OF_PRISMS = 15;

        Prism[] prisms = new Prism[NUMBER_OF_PRISMS];
        for (int i = 0; i < prisms.length; i++) {
            prisms[i] = generateRandomPrism();
        }

        System.out.println("Static number of prisms:");
        for (Prism prism : prisms) {
            System.out.println(prism.toString());
        }

        // variable number of prisms
        List<Prism> prismList = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_PRISMS; i++) {
            prismList.add(generateRandomPrism());
        }

        System.out.println("Variable number of prisms");
        for (Prism prism : prismList) {
            System.out.println(prism.toString());
        }
    }

    private static Prism generateRandomPrism() {
        Random random = new Random();
        return new Prism(
                random.nextInt(6),
                random.nextInt(10),
                random.nextInt(10),
                random.nextInt(10));
    }
}
