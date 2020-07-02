import java.util.Scanner;

class MaxWhile {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
 
        int max = 0;
        while (scanner.hasNext()) {
            int elem = scanner.nextInt();
            if (elem > max) {
                max = elem;
            }
        }
        
        System.out.println(max);
    }
}

