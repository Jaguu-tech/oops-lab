/*Design a Java interface named StudentDetails that defines the structure for
handling student information. Implement this interface in a class named Student.
Interface : StudentDetails
void accept(); u Accepts input for marks in English, Hindi and Maths.
void compute(); u Calculates the total marks and the average of three subjects.
void display(); u Displays the student's name, marks, total and average.
Class : Student (Implements StudentDetails)
Data Members : String name u Stores the name of the student.
int eng u Stores marks in English.
int hn u Stores marks in Hindi.
int mts u Stores marks in Maths.
double total u Stores the total marks.
double avg u Stores the average marks.
Task : Write a Java program where the Student class implements the StudentDetails
interface. Create an object of Student, invoke the required methods and
display the student's details. */

import java.util.Scanner;

// Interface
interface StudentDetails
{
    void accept();     // Accept input
    void compute();    // Calculate total and average
    void display();    // Display details
}

// Class implementing interface
class Student implements StudentDetails
{
    String name;
    int eng;
    int hn;
    int mts;
    double total;
    double avg;

    Scanner sc = new Scanner(System.in);

    // Method to accept input
    public void accept()
    {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter English Marks: ");
        eng = sc.nextInt();

        System.out.print("Enter Hindi Marks: ");
        hn = sc.nextInt();

        System.out.print("Enter Maths Marks: ");
        mts = sc.nextInt();
    }

    // Method to compute total and average
    public void compute()
    {
        total = eng + hn + mts;
        avg = total / 3;
    }

    // Method to display details
    public void display()
    {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("English Marks: " + eng);
        System.out.println("Hindi Marks: " + hn);
        System.out.println("Maths Marks: " + mts);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}

// Main class
public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student();

        s.accept();
        s.compute();
        s.display();
    }
}
