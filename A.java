/*single inheritance */

/*public class A {
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
*/

/*Multilevel inheritance */

/*public class A{
    void showA(){
        System.out.println("a class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("b class method");
    }
}
class C extends B{
    void showC(){
        System.out.println("c class method");
    }
    public static void main(String[] args) {
        A a = new A();
        a.showA();
        System.out.println("----------------------");
        B b = new B();
        b.showA();
        b.showB();
        System.out.println("----------------------");
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}*/

/* Hierarchical inheritance */

public class A{
    void showA(){
        System.out.println("a class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("b class method");
    }
}
class C extends A{
    void showC(){
        System.out.println("c class method");
    }
    public static void main(String[] args) {
        A a = new A();
        a.showA();
        System.out.println("----------------");
        B b = new B();
        b.showA();
        b.showB();
        System.out.println("----------------");
        C c = new C();
        c.showA();
        c.showC();
    }
}