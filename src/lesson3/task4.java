//Given a string "ABCDEFGHIJK". You need to make this string lowercased and remove all vowels.

import java.util.HashSet;
import java.util.Set;

public class task4 {
    public static void main(String[] args) {
        String string ="ABCDEFGHIJK";
        string = string.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(string.toLowerCase());

    }}
