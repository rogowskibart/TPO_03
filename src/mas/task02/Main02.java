package mas.task02;

import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        final int TEXT_LENGTH = 12;

        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < TEXT_LENGTH; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            builder.append(randomChar);
        }
        System.out.println(builder.toString());
    }
}
