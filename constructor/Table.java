/*
// different no of arg

public class Table {
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        Table t = new Table();
        t.show();
        t.show(2);
    }
}

// different seq of arg

class Table{
    void show(int a, String b){
        System.out.println(a+" "+b);
    }
    void show(String a, int b){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Table t = new Table();
        t.show(2, "Jagruti");
        t.show("Mansi", 3);
    }

}
    */

// different type of arg

class Table{
    void show(int a){
        System.out.println(a);
    }
    void show(String b){
        System.out.println(b);
    }
    public static void main(String[] args) {
        Table t = new Table();
        t.show("Jagruti");
        t.show(7);
    }
}