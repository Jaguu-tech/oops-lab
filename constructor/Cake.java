public class Cake {
    String name;
    String shape;
    int weight;
    String flavour;

    Cake(String name, int weight){
        this.name=name;
        this.weight=weight;
    }
    Cake(String name, int weight, String shape){
        this.name=name;
        this.weight=weight;
        this.shape=shape;
    }
    Cake(String name, int weight, String shape, String flavour){
        this.name=name;
        this.weight=weight;
        this.shape=shape;
        this.flavour=flavour;
    }

    void display() {
        System.out.println(name + " " + weight);

        if (shape != null)
            System.out.println(" " + shape);

        if (flavour != null)
            System.out.println(" " + flavour);

        System.out.println();
    }
    public static void main(String[] args) {
        Cake c1 = new Cake("Banana", 1);
        Cake c2 = new Cake("Chocolate", 2, "Rectangle");
        Cake c3 = new Cake("Strawberry", 2, "Circle", "Mango");
        c1.display();
        c2.display();
        c3.display();
    }
}
