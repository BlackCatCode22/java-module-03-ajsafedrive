// aJ 9/11/25
// App.java


public class App {
    public static void main(String[] args) {

        // Create new Student object



        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halpert";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbabtion = false;

        Student myStudent2 = new Student();
        myStudent2.firstName = "Pam";
        myStudent2.lastName = "Beasley";
        myStudent2.major = "Art";
        myStudent2.gpa = 2.5;
        myStudent2.age = 25;
        myStudent2.onProbabtion = true;


        // output the new objects attribute

        System.out.println("Student name is " + myStudent2.firstName);






    }
}