package mas.task04;

import java.util.ArrayList;
import java.util.Random;

public class Main04 {
    public static void main(String[] args) {
        Random random = new Random();
        final int TEXT_LENGTH = random.nextInt(100);
        ArrayList<String> stringList = generateRandomNumberOfStrings(TEXT_LENGTH);

        for (int i = 0; i < stringList.size(); i++) {
            if (random.nextBoolean()) stringList.remove(i);
        }

        System.out.println(stringList.toString());
    }

    private static ArrayList<String> generateRandomNumberOfStrings(int numberOfStrings) {
        String[] stringArray = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nibh augue, suscipit a, scelerisque sed, lacinia in, mi. Cras vel lorem. Etiam pellentesque aliquet tellus. Phasellus pharetra nulla ac diam. Quisque semper justo at risus. Donec venenatis, turpis vel hendrerit interdum, dui ligula ultricies purus, sed posuere libero dui id orci. Nam congue, pede vitae dapibus aliquet, elit magna vulputate arcu, vel tempus metus leo non est. Etiam sit amet lectus quis est congue mollis. Phasellus congue lacus eget neque. Phasellus ornare, ante vitae consectetuer consequat, purus sapien ultricies dolor, et mollis pede metus eget nisi. Praesent sodales velit quis augue. Cras suscipit, urna at aliquam rhoncus, urna quam viverra nisi, in interdum massa nibh nec erat.".split(" ");
        ArrayList<String> listOfStrings = new ArrayList<>();
        for (int i = 0; i < numberOfStrings; i++) {
            listOfStrings.add(stringArray[i % stringArray.length]);
        }
        return listOfStrings;
    }
}