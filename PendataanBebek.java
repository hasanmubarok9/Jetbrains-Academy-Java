import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;


public class PendataanBebek {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
		{   
            // Read the number of weights
            int n = Integer.parseInt(reader.readLine());

            // Read the weights and save it to array
            String[] strWeights = reader.readLine().split(" ");
            
            // Map weights from string to integer
            int[] weights = new int[strWeights.length];
            for(int i = 0; i < n; i++) {
                weights[i] = Integer.parseInt(strWeights[i]);
            }
            
            // Read the number of test cases
            int tests = Integer.parseInt(reader.readLine());

            int[] results = new int[tests];

            for(int i = 0; i < tests; i++) {
                String[] bound = reader.readLine().split(" ");
                int x = Integer.parseInt(bound[0]);
                int y = Integer.parseInt(bound[1]);

                int[] lowerBounds = binarySearch(weights, x, n);
                int[] upperBounds = binarySearch(weights, y, n);
                results[i] = upperBounds[1] - lowerBounds[1];
            }

            for(int i = 0; i < tests; i++) {
                PrintStream ps = new PrintStream(System.out);
                // ps.println();
                ps.println(results[i]);
            }



        } catch (IOException eox) // catch error
		{
			System.out.println(eox);
		}            
    }

    public static int[] binarySearch(int[] arr, int x, int n) {
        int right = 0;
        int h = n;
        int m;
        while (right < h) {
            m = (right + h) / 2;
            if (x < arr[m]) {
                h = m;
            } else {
                right = m + 1;
            }
        }

        int left = 0;
        h = right - 1;
        while (left < h) {
            m = (left + h) / 2;
            if (x > arr[m]) {
                left = m + 1;
            } else {
                h = m;
            }
        }
        return new int[] { left, right-1 };
    }

}