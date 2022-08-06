// Given a string "Den, John, Will, Kate, Adam, Robin". Print all the names from the following string each from a new line.
//   Example:
//   Den
//   John
//   Will
//   Kate


public class task7 {
    public static void main(String[] args) {
        String names = "Den, John, Will, Kate, Adam, Robin";
        String[] array = names.split(", ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
