public class Employee {
    int id;
    String name;
    static String company="Amazon";

    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println(id+" "+name+" "+company);
    }

    public static void main(String[] args) {
        Employee e1= new Employee(101, "Jagruti");
        Employee e2 = new Employee(102, "Mansi");
        Employee e3 = new Employee(103, "Atharav");

        e1.display();
        e2.display();
        e3.display();
    }
}
