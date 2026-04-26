public class Method {
    final void m1(){
        System.out.println("i'm in method class");
    }
}
class B extends Method{
    /*void m1(){
        System.out.println("i'm in b class");
    }*/
// we cannot use the same method name after declaring any method as final we cannot override it
    void show(){
        super.m1();
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
