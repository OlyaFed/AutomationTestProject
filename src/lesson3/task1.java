
// Given a string. Write a code that will create a new string made of the first two characters of the initial string.
//If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
//
//For example:
//"AE_1381" -> "AE"
//"A" -> "A"
//"" -> ""

public class task1 {
    public static void main(String[] args) {
        String sentence = "AE_1381";
        if (sentence.length()>2)
        {
             sentence = sentence.substring(0,2);
        }
        System.out.println(sentence);
        String sentence1 = "X";
        if (sentence1.length()>2)
        {
            sentence1 = sentence1.substring(0,2);
        }
        System.out.println(sentence1);
        String sentence2 = "";
        if (sentence2.length()>2)
        {
            sentence2 = sentence2.substring(0,2);
        }
        System.out.println(sentence2);
        }
    }
