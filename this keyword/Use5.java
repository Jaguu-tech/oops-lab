public class Use5 {
     Use5(ThisDemo td){
        System.out.println("test class constructor");
     }
}
class ThisDemo{
    void m1(){
        Use5 u = new Use5(this); 
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.m1();
    }
}
