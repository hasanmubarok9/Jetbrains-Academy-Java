import java.util.*;
// import java.lang.Math;

public class Decomposition { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toDecompose = scanner.nextInt();

        provideDecomposition(toDecompose, toDecompose, "");
    }

    private static void provideDecomposition(int toDecompose, int max, String out) {
        if (toDecompose == 0) {
            System.out.println(out);
        } else if (toDecompose > 0) {
            for (int i = 1; i <= max; i++) {
                System.out.println("toDecompose : " + toDecompose);
                System.out.print("i : ");
                System.out.println(i);
                System.out.print("toDecompose - i : ");
                System.out.println(toDecompose - i);
                System.out.print("out : ");
                System.out.println(out);
                provideDecomposition(toDecompose - i, i, out + i + " ");
            }
        }
    }
}
