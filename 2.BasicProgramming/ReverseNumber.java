import java.util.Scanner;

public class ReverseNumber {

    public static int Reverse(int num) {

        int myNum = num;
        int rev = 0;

        while (num != 0) {
            int lastDigit = num % 10; // to find last digit
            rev = (rev * 10) + lastDigit;
            num = num / 10; // to remove last digit

        }

        return rev;

    }

    public static void main(String[] args) {

        System.out.print(Reverse(200));
    }
}