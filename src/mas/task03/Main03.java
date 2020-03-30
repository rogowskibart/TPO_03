package mas.task03;

import java.util.Random;

public class Main03 {
    public static void main(String[] args) {
        String[] stringArray = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nibh augue, suscipit a, scelerisque sed, lacinia in, mi. Cras vel lorem. Etiam pellentesque aliquet tellus. Phasellus pharetra nulla ac diam. Quisque semper justo at risus. Donec venenatis, turpis vel hendrerit interdum, dui ligula ultricies purus, sed posuere libero dui id orci. Nam congue, pede vitae dapibus aliquet, elit magna vulputate arcu, vel tempus metus leo non est. Etiam sit amet lectus quis est congue mollis. Phasellus congue lacus eget neque. Phasellus ornare, ante vitae consectetuer consequat, purus sapien ultricies dolor, et mollis pede metus eget nisi. Praesent sodales velit quis augue. Cras suscipit, urna at aliquam rhoncus, urna quam viverra nisi, in interdum massa nibh nec erat.".split(" ");
        Random random = new Random();
        final int TEXT_LENGTH = random.nextInt(100);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < TEXT_LENGTH; i++) {
            builder.append(stringArray[i % stringArray.length]);
            builder.append(" ");
        }

        System.out.println(builder.toString());
    }
}
