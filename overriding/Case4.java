class Case4{
    void show(){
        System.out.println("1");
    }
}
class Xyz extends Case4{
    void show(){
        super.show();
        System.out.println("2");
    }
    public static void main(String[] args) {
        Xyz x = new Xyz();
        x.show();
    }
}