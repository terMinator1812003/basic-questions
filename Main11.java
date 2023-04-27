import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int age;
    String gender;
    int sub1;
    int sub2;
    int total;
    double percentage;
    String grade;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter roll number:");
        rollno = sc.nextInt();
        System.out.println("Enter age:");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter gender:");
        gender = sc.nextLine();
        System.out.println("Enter marks for Subject 1:");
        sub1 = sc.nextInt();
        System.out.println("Enter marks for Subject 2:");
        sub2 = sc.nextInt();
    }

    void calculateTotal() {
        total = sub1 + sub2;
    }

    void calculatePercentage() {
        percentage = (double) total / 2;
    }

    void calculateGrade() {
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollno);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Marks for Subject 1: " + sub1);
        System.out.println("Marks for Subject 2: " + sub2);
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].inputDetails();
            students[i].calculateTotal();
            students[i].calculatePercentage();
            students[i].calculateGrade();
        }
        System.out.println("Details of all students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Details of student " + (i + 1) + ":");
            students[i].displayDetails();
        }
        sc.close();
    }
}