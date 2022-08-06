public class task5 {
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        String c;
        if (a.length() > b.length()) {
          c =b + a + b;
        } else {
           c=a + b + a;
        }
        System.out.println(c);
    }}
