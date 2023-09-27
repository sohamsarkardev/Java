public class DecimalToBinary {

    public static int DecToBin(int num) {
        int bin = 0;
        int pow = 0;
        while (num > 0) {
            int rem = num % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        return bin;

    }

    public static void main(String[] args) {
        System.out.println(DecToBin(4));
    }

}
