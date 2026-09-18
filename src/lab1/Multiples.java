package lab1;

public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;
        while (i < 1000) {
             result += count(i);
            i++;
        }
        System.out.println(result);
    }
    static int count(int i) {
        int count = 0;
        boolean divisibleby3 = i % 3 == 0;
        boolean divisibleby5 = i % 5 == 0;
        if (divisibleby3 || divisibleby5) {
            count += 1;
        }
        return count;
    }
}
