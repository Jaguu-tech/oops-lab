final public class Class {
    int a =10;
}

// as we have use final keyword in a class we cannot extends or inherits it
// after removing final the whole code will run

/*class B extends Class{
    int a=20;

    void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }

    public static void main(String[] args) {
        B b = new B();
        b.show(33);
    }
}*/
