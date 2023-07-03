package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();
        boolean continueInput = true;

        while (continueInput) {
            Student student = new Student();

            System.out.print("Enter Full Name: ");
            student.setFullName(scanner.nextLine());
            System.out.print("Enter Address: ");
            student.setAddress(scanner.nextLine());
            System.out.print("Enter Date of Birth (dd/mm/yyyy): ");
            student.setDob(scanner.nextLine());
            System.out.print("Enter Gender: ");
            student.setGender(scanner.nextLine());
            System.out.print("Enter Final Grade: ");
            student.setFinalGrade(scanner.nextFloat());

            scanner.nextLine(); // Consume the newline character after reading the float

            studentList.add(student);

            System.out.print("Do you want to continue (Y/N)? ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("N")) {
                continueInput = false;
            }
        }

        System.out.println("\nList of Students:");
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("FullName: " + student.getFullName());
            System.out.println("Address: " + student.getAddress());
            System.out.println("DOB: " + student.getDob());
            System.out.println("Gender: " + student.getGender());
            System.out.println("FinalGrade: " + student.getFinalGrade());
        }

        float totalFinalGrade = 0;
        int studentCount = studentList.size();

        for (Student student : studentList) {
            totalFinalGrade += student.getFinalGrade();
        }

        float averageFinalGrade = totalFinalGrade / studentCount;

        System.out.println("\nAverage Final Grade: " + averageFinalGrade);

        System.out.println("\nStudent Performance:");

        for (Student student : studentList) {
            String fullName = student.getFullName();
            float finalGrade = student.getFinalGrade();
            String performance;

            if (finalGrade < 4.0) {
                performance = "học lực kém";
            } else if (finalGrade < 5.0) {
                performance = "học lực yếu";
            } else if (finalGrade < 5.5) {
                performance = "học lực trung bình yếu";
            } else if (finalGrade < 6.5) {
                performance = "học lực trung bình";
            } else if (finalGrade < 7.0) {
                performance = "học lực trung bình khá";
            } else if (finalGrade < 8.0) {
                performance = "học lực khá";
            } else if (finalGrade < 8.5) {
                performance = "học lực khá giỏi";
            } else {
                performance = "học lực giỏi";
            }

            System.out.println("Học sinh " + fullName + " " + performance);
        }

        scanner.close();
    }
}