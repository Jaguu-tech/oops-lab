/*synchronized method */

public class Case6 {
    synchronized void show(){
        System.out.println("1");
    } 
}
class Xyz extends Case6{
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Case6 c = new Case6();
        c.show();
        Xyz x = new Xyz();
        x.show();
    }
}