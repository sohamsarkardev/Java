public class LinearSearch {

    public static int findIndex(int numbers[], int key) {
        // int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            // count = count + 1;
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 14;
        int index = findIndex(number, key);
        if (index == -1) {
            System.out.println("Number not found ");
        } else {
            System.out.println("Number found at : " + index);
        }

    }

}
