
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nilryan
 */
public class UserInterface {

    private GradeRegister grades;
    private Scanner scanner;

    public UserInterface(GradeRegister grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;;
    }

    public void start() {
        readPoints();
        printAverage();
        printPassingAverage();
        printPassingPercentage();
        System.out.println("Grade distribution:");
        printGradeDistribution();
    }

    // method to read input
    public void readPoints() {

        System.out.println("Enter points totals, -1 stops");

        while (true) {

            int grade = scanner.nextInt();
            if (grade == -1) {
                break;
            }

            if (grade < 0 || grade > 100) {
                continue;
            }

            this.grades.addGrades(grade);
        }

    }
    
    // method to print average grades
    public void printAverage() {
        System.out.println("Point average (all): " + grades.averageGrade());
    }
    
    public void printPassingAverage() {
        if (grades.passingPercentage() == 0) {
            System.out.println("Point average (passing): -");
        }
        System.out.println("Point average (passing): " + grades.passingAverageGrade());
    }
    
    public void printPassingPercentage() {
        System.out.println("Pass percentage: " + grades.passingPercentage());
    }
    
    public void printGradeDistribution() {
        int[] array = grades.getGradeDistribution();
       
        for (int i = 5; i >= 0; i--){
            String star = "";
            
            for (int j = 0; j < array[i]; j++) {
                star += "*";
            }
            
            System.out.println(i + ": " + star);
        }
    }
    
    
    
    

}
