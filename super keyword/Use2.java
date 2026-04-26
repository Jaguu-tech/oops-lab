public class Use2 {
    Use2(){
        System.out.println("i'm in Use2 class");
    }
}
class B extends Use2{
    B(){
        super();                                   // we can call parent class constructor
        System.out.println("i'm class B");      //without using super keyword still both output are coming 
    }

    public static void main(String[] args) {
        B b = new B();
    }
}
