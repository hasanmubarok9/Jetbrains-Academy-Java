import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        
        final int len = scanner.nextInt();
        int sum = 0;

        for (int i = 0, n; i < len; i++) {
            n = scanner.nextInt();
            sum += (n % 6 == 0) ? n : 0;
        }

        System.out.println(sum);
    }
}