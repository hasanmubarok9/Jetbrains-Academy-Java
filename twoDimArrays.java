import java.util.Scanner;
class twoDimArrays {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
        
        int columns = scanner.nextInt();
        
        int[][] twoDimArray = new int[rows][columns];
        
        // scanning input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        int columnIndexSwap1 = scanner.nextInt();

        int columnIndexSwap2 = scanner.nextInt();

        int[] swap1 = new int[rows];
        for (int i = 0; i < rows; i++) {
            swap1[i] = twoDimArray[i][columnIndexSwap1];
        }

        int[] swap2 = new int[rows];
        for (int i = 0; i < rows; i++) {
            swap2[i] = twoDimArray[i][columnIndexSwap2];
        }
        // swap the column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j == columnIndexSwap1) {
                    twoDimArray[i][j] = swap2[i];    
                }

                if (j == columnIndexSwap2) {
                    twoDimArray[i][j] = swap1[i];    
                }
            }
        }

        // print array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}