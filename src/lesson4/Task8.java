package lesson4;
//Find the information about the order of initialization, when you create a new object of a class:
//When constructors, initialization blocks are being executed.
//When fields are initialized with default values.

 public class Task8 {
    public static void main(String[] args) {
        Father m  = new Father();
    }
}

class Father {
    public static String fatherStr1 = "fatherStr1(Static field initialization values)";

    public String fatherStr2 = "fatherStr2(Field initialization values)";

    static {
        System.out.println("The parent static code block:" + fatherStr1);
        fatherStr1 = "fatherStr1(Static code block assignment)";
    }

    {
        System.out.println("The parent constructor block:" + fatherStr2);
        fatherStr2 = "fatherStr2(Construct block assignment)";
    }

    public Father() {
        System.out.println("The parent constructor block:" + fatherStr2);
        fatherStr2 = "fatherStr2(Constructor assignment)";
    }
}



