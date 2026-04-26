public class Use3 {
    void m1(){
        System.out.println("i'm in main method");
    }
}
class B extends Use3{
    void m1(){
        System.out.println("i'm in child class");
        super.m1();
    }

    public static void main(String[] args) {
        B b = new B();
        b.m1();
    }
}