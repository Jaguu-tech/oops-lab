//Write a program to create a class Box with width, height, depth. Initialize using a parameterized constructor and find the volume.

public class Box {
    int width;
    int height;
    int depth;

    Box(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }

    void display(){
        float volume=width*height*depth;
        System.out.println("Width of the box: "+width);
        System.out.println("Height of the box: "+height);
        System.out.println("Depth of the box: "+depth);
        System.out.println("Volume of the box: "+volume);
    }

    public static void main(String[] args) {
        Box b = new Box(3, 4, 5);
        b.display();
    }
}
