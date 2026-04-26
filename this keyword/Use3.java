public class Use3 {

    Use3(){
        this(100); // represent Use3(int a)
        System.out.println("no args constructor");
    }

    Use3(int a){
       // this();   //represent Use3() 
        System.out.println("parameterised constructor");
    }

    public static void main(String[] args) {
        Use3 u = new Use3();
    }
}
