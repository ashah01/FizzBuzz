package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 4, 4);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int i = 1;
        int count = 0;
        while (i < n) {
           if (doFizzBuzz(i, a, b)) {
               count++;
            }

           i++;
        }
        return count;
    }

    public static boolean doFizzBuzz(int i, int a, int b) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % a == 0;
        boolean divisibleBy5 = i % b == 0;

        return divisibleBy3 || divisibleBy5;
    }
}
