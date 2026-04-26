class Bird {
    void eat(){
        System.out.println("I'm eating");
    }
}

class Parrot extends Bird{
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat();
    }
}

