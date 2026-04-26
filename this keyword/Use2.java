public class Use2 {
    void display(){
        System.out.println("Hellooo");
    }
    void show(){
        this.display();
        System.out.println("I'm a good girl!!");
    }
    // if you dont use the this keyword compiler automatically adds this keyword while invoking the method

    public static void main(String[] args) {
        Use2 u = new Use2();
        u.show();
    }
}
