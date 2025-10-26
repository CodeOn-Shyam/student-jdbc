package org.shyam;

import java.util.Scanner;

public class App {

    private static final Scanner sc = new Scanner(System.in);

    private static void getAddStudentDetails() {
        System.out.print("Enter Student ID: ");
        var id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        var name = sc.nextLine();

        System.out.print("Enter Student Surname: ");
        var surname = sc.nextLine();

        System.out.print("Enter Student Email: ");
        var email = sc.nextLine();

        System.out.print("Enter Student Phone Number: ");
        var phone = sc.nextLine();

        System.out.print("Enter Student Branch: ");
        var branch = sc.nextLine();

        System.out.print("Enter Student Joining Year: ");
        var joiningYear = sc.nextLine();

        var student = new Student();
        student.add(id, name, surname, email, phone, branch, joiningYear);
    }

    private static void updateStudentDetails() {
        System.out.print("Enter Student ID: ");
        var id = sc.nextInt();
        sc.nextLine();

        System.out.println("""
                Select detail to update:
                  1. Name
                  2. Surname
                  3. Email
                  4. Phone
                  5. Branch
                  6. Joining Year
                """);

        System.out.print("Enter option number: ");
        var option = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter new value: ");
        var value = sc.nextLine();

        var column = switch (option) {
            case 1 -> "NAME";
            case 2 -> "SURNAME";
            case 3 -> "EMAIL";
            case 4 -> "PHONE";
            case 5 -> "BRANCH";
            case 6 -> "JOINING_YEAR";
            default -> {
                System.out.println("Invalid option selected.");
                yield null;
            }
        };

        if (column != null) {
            var student = new Student();
            student.update(id, column, value);
        }
    }

    private static void deleteStudentDetails() {
        System.out.print("Enter Student ID: ");
        var id = sc.nextInt();
        var student = new Student();
        student.delete(id);
    }
    public static void fetchStudent(){
        System.out.print("Enter Student ID: ");
        var id = sc.nextInt();
        var student = new Student();
        student.fetch(id);
    }
    public static void fetchAll(){
        var student = new Student();
        student.fetchAll();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Student Management System");

        while (true) {
            System.out.println("""
                    -------------------------------
                    1  Add Student
                    2  Update Student
                    3  Delete Student
                    4 view student details
                    5 view All
                    6  Exit
                    -------------------------------
                    """);
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // clear invalid input
                continue;
            }

            var choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                getAddStudentDetails();
            } else if (choice == 2) {
                updateStudentDetails();
            } else if (choice == 3) {
                deleteStudentDetails();
            }else if(choice == 4){
                fetchStudent();
            }else if(choice==5){
                fetchAll();
            }else if (choice == 6) {
                System.out.println("Exiting... Goodbye!");
                sc.close();
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
