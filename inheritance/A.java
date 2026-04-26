/*single inheritance */

public class A {
    void showA(){
        System.out.println("a class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("b class method");
    }
    public static void main(String[] args) {
        A a= new A();
        a.showA();

        B b = new B();
        b.showA();
        b.showB();
    }
}
