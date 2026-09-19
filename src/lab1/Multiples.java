package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    static int multiples(int n, int a, int b) {
        int i = 1;
        int result = 0;

        while (i < n) {
            boolean divisibleby3 = i % a == 0;
            boolean divisibleby5 = i % b == 0;
            if (divisibleby3 || divisibleby5) {
                result += 1;
            }
            i++;
        }
        return result;
    }
    static int multiples() {
        return multiples(1000, 3, 5);
    }
}