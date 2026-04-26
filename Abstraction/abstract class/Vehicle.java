abstract class Vehicle{
    int no_of_tyres;
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("start with key");
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println("start with kick");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.no_of_tyres=4;
        c.start();

        Scooter s = new Scooter();
        s.no_of_tyres=2;
        s.start();
    }
}