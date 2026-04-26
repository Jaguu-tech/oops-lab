class Use1{
    int a=10;
}
class B extends Use1{
    int a=20;

    void show(int a){
        System.out.println(a);
        System.out.println(this.a);    // refers to the current class instance
        System.out.println(super.a);  //refers to the parent class instance
    }

    public static void main(String[] args) {
        B ob = new B();
        ob.show(30);
    }
}