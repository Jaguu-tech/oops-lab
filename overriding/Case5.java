/* Final method */
/*public class Case5 {
        final void show(){
        System.out.println("1");
    }
}
class Xyz extends Case5{
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Case5 c = new Case5();
        c.show();
        Xyz x = new Xyz();
        x.show();
    }
}*/

/* Static method */
/*class Case5{
        static void show(){
        System.out.println("1");
    }
}
class Xyz extends Case5{
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Case5 c = new Case5();
        c.show();
        Xyz x = new Xyz();
        x.show();
    }
}*/

/* Private method */

class Case5{
     void show(){
        System.out.println("1");
    }
}
class xyz extends Case5{
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Case5 c = new Case5();
        c.show();
        Xyz x = new Xyz();
        x.show();
    }
}