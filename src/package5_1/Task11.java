package package5_1;
//What is the difference between package-private access and protected access?

//Answer: The access level of a protected modifier is within the package and outside the package through child class.

//package-private access allows access within one package.


public class Task11 {
    public static void main(String[] args) {
        N1 now = new N1();
        System.out.println(now.k);
        now.test();

    }
}

class N {
    protected String k = "jjkk";

    protected void test() {
        System.out.println(this.k);
    }
}

class N1 extends N {
}
