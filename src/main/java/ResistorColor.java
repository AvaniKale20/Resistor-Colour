import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

class ResistorColor {
    //todo-1st we can go through hashmap
    int colorCode1(String color) {
        HashMap<String, Integer> colorMap = new HashMap<>();
        colorMap.put("black", 0);
        colorMap.put("brown", 1);
        colorMap.put("red", 2);
        colorMap.put("orange", 3);
        colorMap.put("yellow", 4);
        colorMap.put("green", 5);
        colorMap.put("blue", 6);
        colorMap.put("violet", 7);
        colorMap.put("grey", 8);
        colorMap.put("white", 9);

        return colorMap.get(color);
    }

    String[] colors1() {
        String[] colour = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colour;
    }

    // TODO: 12/11/19 we can use AsArray list
    int colorCode2(String color) {
        return Arrays.asList(colors()).indexOf(color);
    }

    String[] colors2() {
        String[] colour = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colour;
    }

    // TODO: 12/11/19 we can use ordinal() with enum
    private enum Colors {
        black, brown, red, orange, yellow, green, blue, violet, grey, white
    }

    //imp note:stream is collection of object
    //ordinal()=the initial constant is assigned an ordinal of zero)
    int colorCode(String color) {
        return Colors.valueOf(color).ordinal();
    }

    String[] colors() {

        return stream(Colors.values())
                .map(Enum::name)
                .toArray(String[]::new);

    }
}
