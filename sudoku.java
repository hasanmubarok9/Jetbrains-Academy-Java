import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class sudoku {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int dim = (int) Math.pow(input, 2);

        int[][] inArray = new int[dim][dim];
        
        String valid = "YES";
        
        // scanning input
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                inArray[i][j] = scanner.nextInt();
            }
        }

        // validation
        for (int i = 0; i < dim; i++){

            // validate rows
            if(!validate(inArray[i])){
                valid = "NO";
            }
            
            // generate column
            int[] cols = new int[dim];
            for (int j = 0; j < dim; j++){
                cols[j] = inArray[j][i];
            }
            
            // validate columns
            if(!validate(cols)){
                valid = "NO";
            }

        }

        // validate submatrix
        for(int i = 0; i < input; i++){
            for(int j = 0; j < input; j++){
                int[] sub = new int[dim];
                int index = 0;
                for(int k = j*input; k < j*input + input; k++ ){
                    for(int l = i*input; l < i*input + input; l++){                        
                        sub[index] = inArray[k][l];
                        index++;
                    }
                }
                if(!validate(sub)){
                    valid = "NO";
                }
            }
        }

        System.out.println(valid);
    }

    public static boolean validate(int [] array){
        int[] arrayValidator = new int[array.length];
        for (int i = 0; i < array.length; i++){
            arrayValidator[i] = i+1;
        }

        int[] duplicatedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(duplicatedArray);
        // System.out.println(Arrays.toString(array));

        return  Arrays.equals(arrayValidator, duplicatedArray);
    }
}