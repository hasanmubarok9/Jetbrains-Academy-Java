import java.util.*;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] max = new int[B - A + 1];
        int[] seeds = new int[B - A + 1];
        for (int i = A; i <= B; i++ ) {
            Random random = new Random(i);   
            int[] randint = new int[N];         
            for (int j = 0; j < N; j++) {
                randint[j] = random.nextInt(K);
            }
            System.out.println("randint " + randint);
            int greatest = randint[0];
            for (int j = 0; j < N; j++) {
                if (randint[j] > greatest) {
                    greatest = randint[j];
                }
            }
            seeds[i - A] = i;
            max[i - A] = greatest;
        }
        
        System.out.println("max " + max);
        int min = max[0];
        int indexSeedsMin = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[i] < min) {
                min = max[i];
                indexSeedsMin = i;
            }
        }
        
        System.out.println(indexSeedsMin);
        System.out.println(min);
    }
}
