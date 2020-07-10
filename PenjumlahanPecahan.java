import java.util.Scanner;

public class PenjumlahanPecahan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        long D = scanner.nextLong();

        sumFraction(A, B, C, D);

    }

    public static void sumFraction(long a, long b, long c, long d) {
        long numerator = (lcm(b, d)/b)*a + (lcm(b, d)/d)*c;
        long denumerator = lcm(b, d);

        System.out.print(numerator/gcd(numerator, denumerator));
        System.out.print(" ");
        System.out.println(denumerator/gcd(numerator, denumerator));
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }
}