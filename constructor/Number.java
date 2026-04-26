//Create a class Number that has one data member num. Initialize it using a parameterized constructor and check whether the number is even or odd.
public class Number {
    int num;
    Number(int n){
        num = n;
    }
    void display(){
        System.out.println("Number is: "+num);
    }
    void check(){
        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
        System.out.println("__________________________________________________________");
    }
    public static void main(String[] args) {
        Number n1 = new Number(5);
        n1.display();
        n1.check();
    }
}
