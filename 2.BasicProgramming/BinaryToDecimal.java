import java.lang.Math;

public class BinaryToDecimal {

    public static int binToDec(int bin) {
        int myNum = bin;
        int dec = 0;
        int pow = 0;

        while (bin > 0) {
            int lastDigit = bin % 10;
            dec = dec + (lastDigit * (int) (Math.pow(2, pow)));
            pow++;
            bin = bin / 10;

        }
        return dec;
    }

    public static void main(String[] args) {
        System.out.println(binToDec(10101));
    }

}
