
/**
In Java Arrays paramaters passed in fuction as pass by Reference where as for other cases like in integer it will pass by value.
So in this when we pass value in class array value will update where in case of integer value are not changing
 */
import java.util.*;

public class ArrayasFunction {
    /**
     * The function "updateMarks" increases the total marks by 2 and increments each
     * individual mark by 1.
     * 
     * @param marks1 An array of integers representing the marks of students.
     * @param total  The total parameter represents the total marks obtained by a
     *               student.
     */

    public static void updateMarks(int marks1[], int total) {
        total = total + 2;
        for (int i = 0; i < marks1.length; i++) {
            marks1[i] = marks1[i] + 1;
        }

    }

    /**
     * The main function in Java initializes an array of marks, prints the marks
     * before updating, calls the
     * updateMarks function to update the marks, and then prints the updated marks
     * and the total marks.
     */
    public static void main(String[] args) {

        int marks[] = { 95, 99 };
        int total = 194;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks Before update " + marks[i]);
        }
        updateMarks(marks, total);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Pass by reference (Updated Marks) " + marks[i]);
        }

        System.out.println("Pass by Value (Total Marks) " + total);
    }

}
