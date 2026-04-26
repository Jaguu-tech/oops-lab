/*Multilevel inheritance */

public class B{
    void showB(){
        System.out.println("b class method");
    }
}
class A extends B{
    void showA(){
        System.out.println("a class method");
    }
}
class C extends A{
    void showC(){
        System.out.println("c class method");
    }
    public static void main(String[] args) {
        B b = new B();
        b.showB();
        System.out.println("----------------------");
        A a = new A();
        a.showB();
        a.showA();
        System.out.println("----------------------");
        C c = new C();
        c.showB();
        c.showA();
        c.showC();
    }
}

