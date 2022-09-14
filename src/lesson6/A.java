package lesson6;

public class A {
private B b;
private C c;

    public A(){
        this.b=new B();
        this.c=new C();
        this.b.setRole("admin");
        this.c.setSalary("19000");
    }
    public String getSalary() {
        return this.c.getSalary();
    }
    public String getRole() {
        return this.b.getRole();
    }

}
