
//Given two strings. Check if they start with "The".
//
//   Task: word1 = "The End", word2="End The";


public class task3 {
    public static void main(String[] args) {
        String word1 = "The End";
        String word2 = "End The";
        if (word1.substring(0, 3).equals("The")) {
            System.out.println(word1);
        }
        if (word2.substring(0, 3).equals("The")) {
            System.out.println(word2);
        }
    }
}
