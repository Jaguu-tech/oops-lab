// Write a program to create a class Distance with feet and inch. Use parameterized constructor to initialize and display the distance.

public class Distance {

    int feet;
    float inch;

    Distance(int f, float i){
        feet=f;
        inch = i;
    }

    void display(){

        float TotalDistance=feet+(inch/12);
        System.out.println("Feet: "+feet);
        System.out.println("Inches: "+inch);
        System.out.println("Total Distance covered: "+TotalDistance);
    }

    public static void main(String[] args) {
        Distance d = new Distance(20, 4f);
        Distance d2 = new Distance(37, 9f);

       d.display();
       d2.display();
    }
}