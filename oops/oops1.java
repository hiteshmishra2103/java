package oops;

import java.util.Arrays;

public class oops1 {
    public static void main(String[] args) {
        // Student[] students = new Student[5];

        // Student hitesh = new Student();
        // hitesh.rno = 12;
        // hitesh.marks = 23;
        // hitesh.name = "india";

        // hitesh.ChangeName("hitesh");
        // hitesh.PrintName();

        Student Rahul = new Student();

        System.out.println(Rahul.rno);
        // Rahul.PrintName();
    }
}

// create a class
// for every single student

class Student {
    int rno;
    String name;
    float marks;

    // Student() {
    //     this("india");
    // }

    // Student(String newName) {
    //     name = newName;
    // }

    // void ChangeName(String Name) {
    //     this.name = Name;
    // }

    // void PrintName() {
    //     System.out.println(this.name);
    // }

}
