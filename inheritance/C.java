/* Hierarchical inheritance */

public class C{
    void showA(){
        System.out.println("a class method");
    }
}
class B extends C{
    void showB(){
        System.out.println("b class method");
    }
}
class A extends C{
    void showC(){
        System.out.println("c class method");
    }
    public static void main(String[] args) {
        C c = new C();
        c.showA();
        System.out.println("----------------");
        B b = new B();
        b.showA();
        b.showB();
        System.out.println("----------------");
        A a = new A();
        a.showA();
        a.showC();
    }
}
