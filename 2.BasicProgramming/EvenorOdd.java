//package 2.BasicProgramming;

import java.util.Scanner; 

public class EvenorOdd {

    public static void main(String[] args) {

       // int number;

        System.out.println("Enter Number" );

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number % 2 == 0 )
        {
             System.out.println("Number is Even" );
        }
        else
        {
            System.out.println("Number is Odd" );
        }

    }
    
}
