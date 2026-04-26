//Write a Java program that demonstrates method overloading to print user details.
//Create multiple overloaded methods to display the user's information in different formats. 
// The program should :
// (1) Take name, roll number and field of interest as input from the user.
// (2) Use method overloading to print the details in different formats 
//     One method to print only the name.
//     Another method to print name and roll number.
//     A third method to print name, roll number and field of interest in the format :
//           "My name is XYZ and my roll number is XYZ. Myfield of interest is XYZ."


import java.util.Scanner;

class Student {

    void info(String name){
        System.out.println("My name is: " + name);
    }

    void info(String name, int rollno){
        System.out.println("My name is: " + name + " and my roll number is " + rollno + ". " );
    }

    void info(String name, int rollno, String field){
        System.out.println("My name is " + name + " and my roll number is " + rollno + ". My field of interest is " + field + ".");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Field of Interest: ");
        String field = sc.nextLine();

        s.info(name);
        s.info(name, roll);
        s.info(name, roll, field);
    }
}