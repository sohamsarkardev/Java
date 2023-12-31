import java.util.Scanner;

public class BasicArray {

    public static void main(String[] args) {
        int marks[] = new int[100];

        // int marks1[] = { 1, 2, 4 };
        // System.out.println("Array" + marks1);

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println("Array[0] " + marks[0]);
        System.out.println("Array[1] " + marks[1]);
        int percentage = (marks[0] + marks[1]) / 2;
        System.out.println("Percentage " + percentage);
        System.out.println("Length of array " + marks.length);

    }

}
