package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(Reduce(100));
    }
    static int Reduce(int n) {
        return reduce(n);
    }

    static int reduce(int n) {
        int result = 0;
        while (n > 0) {
            boolean iseven = n % 2 == 0;
            boolean isodd = n % 2 == 1;
            if (iseven){
                n = n /2;
            }else if (isodd){
                n = n - 1;
            }
            result += 1;
        }
        return result;
    }
}
