package lesson9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

//1) With the help of HashMap try to calculate all of the unique words in the song Umbrella ignoring the case.
//        Print all of these words to the console with the number of times they appear in the text.
//        Find the most frequent word in the text and print it to the console as well.
public class Lesson9 {
    public static void main(String[] args) {
        String content = null;

        Path filePath = Paths.get(System.getProperty("user.dir") + "/src/lesson9/song.txt");
        try {
            content = Files.lines(Paths.get(filePath.toString())).collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashMap<String, Integer> stCalculated = new HashMap<>();

        content = content.replace(",","");
        content = content.replace(")","");
        content = content.replace("(","");
        content = content.replace("\n"," ");

        for (String s : content.split(" ")) {
           s = s.toLowerCase();
            if (stCalculated.containsKey(s)) {
                stCalculated.put(s, stCalculated.get(s) + 1);
            }
            else {
                stCalculated.put(s, 1);
            }
        }

        String word = "";
        Integer maxCount = 0;

        for (Map.Entry<String, Integer> entry : stCalculated.entrySet()) {
            if(maxCount < entry.getValue()) {
                word = entry.getKey();
                maxCount = entry.getValue();
            }
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("max counts for word: " + word + "counts are: " + maxCount);
    }
}
