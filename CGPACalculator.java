/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cgpacalculator;

import java.util.Scanner;

/**
 *
 * @author onurk
 */
public class CGPACalculator {

    protected static double calculateGPA(int lesson) {
        double totalCredits = 0;
        double totalGradePoints = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < lesson; i++) {
            System.out.print("Enter the grade (in GPA) for course " + i + ": ");
            double grade = sc.nextDouble();
            System.out.print("Enter the credit hours for course " + i + ": ");
            double credits = sc.nextDouble();

            totalGradePoints += grade * credits;
            totalCredits += credits;
        }
        double gpa = totalGradePoints / totalCredits;
        return gpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lessons do you have?");
        int lesson = sc.nextInt();
        System.out.println(calculateGPA(lesson));
    }

}
