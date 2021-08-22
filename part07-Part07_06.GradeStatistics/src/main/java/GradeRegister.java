
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nilryan
 */
public class GradeRegister {
//    TODO 
/* 1. method that returns average points
   2. Point average for points giving a passing grade
   3. Pass percentage
   4. Grade distribution
    
     */
    private ArrayList<Integer> allGrades;
    private ArrayList<Integer> passingGrades;
    private int[] gradeDistribution;

    public GradeRegister() {
        this.allGrades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
        this.gradeDistribution = new int[] {0, 0, 0, 0, 0, 0};
    }

    public void addGrades(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.allGrades.add(grade);
            int index = gradeFilter(grade);
            gradeDistribution[index] = gradeDistribution[index] + 1;

            if (grade >= 50) {
                this.passingGrades.add(grade);
            }
        }
    }

    public double averageGrade() {
        int sum = 0;
        if (this.allGrades.size() == 0) {
            return -1;
        }

        for (Integer grade : this.allGrades) {
            sum += grade;
        }

        return (double) sum / this.allGrades.size();
    }

    public double passingAverageGrade() {
        int sum = 0;
        if (this.passingGrades.size() == 0) {
            return -1;
        }

        for (Integer grade : this.passingGrades) {
            sum += grade;
        }

        return (double) sum / this.passingGrades.size();
    }

    public double passingPercentage() {
        return (double) this.passingGrades.size() / this.allGrades.size() * 100;
    }

    public int[] getGradeDistribution() {
        return gradeDistribution;
    }

    private int gradeFilter(int grade) {
        if (grade < 50) {
            return 0;
        }
        if (grade < 60) {
            return 1;
        }
        if (grade < 70) {
            return 2;
        }
        if (grade < 80) {
            return 3;
        }
        if (grade < 90) {
            return 4;
        }

        return 5;

    }

}
