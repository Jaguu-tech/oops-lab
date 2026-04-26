public class Use4 {
    void m1(Use4 u){
        System.out.println("I'm in m1 method");
    }
    void m2(){
        m1(this);     // here this is used to call the m1 method print statement 
    }
    public static void main(String[] args) {
        {
            Use4 u = new Use4();
            u.m2();
        }
    }
}
