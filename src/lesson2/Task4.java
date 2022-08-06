package lesson2;

public class Task4 {
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        int [] arraySecond = new int[10];


        for (int b = 0; b< arrayOne.length; b++)
        {
            arrayOne[b]= b*b;
        }

        for (int c = 0; c< arrayOne.length; c++) {
            arraySecond[c] = (int) Math.sqrt(arrayOne[c]);
        }

        for (int c = 0; c< arraySecond.length; c++) {
            System.out.println(arrayOne[c]+" Root = "+ arraySecond[c]);
        }
    }
}
