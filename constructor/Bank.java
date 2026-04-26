// By method

public class Bank {
    String name;
    int amount;

    public void object(String c, int a){
        name=c;
        amount=a;
    }
    void display(){
        System.out.println(name+" "+amount);
    }
    public static void main(String[] args) {
        Bank sbi = new Bank();
        sbi.object("SBI", 30000);
        sbi.display();
    }
}
