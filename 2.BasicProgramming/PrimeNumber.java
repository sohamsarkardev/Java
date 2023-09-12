public class PrimeNumber {

    public static boolean primeNum(int num) {

        if (num == 2) {
            return true;
        } else {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void primeRange(int num) {
        for (int i = 2; i <= num; i++) {
            if (primeNum(i)) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        // System.out.println(primeNum(15));
        primeRange(15);

    }

}
