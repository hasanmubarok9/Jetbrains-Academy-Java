import java.util.Arrays;
import java.util.Scanner;

public class boardTicTacToe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Scanning input cells
        String cells = scanner.nextLine();

        // Declare array of char from cells string
        char[] cellsArr = new char[cells.length()];

        for(int i=0; i < cells.length(); i++){
            cellsArr[i] = cells.charAt(i);
        }

        int k = 0;
        for(int i=0; i < 5; i++){
            for(int j=0; j < 9; j++){
                if (i == 0 || i == 4){
                    System.out.print('-');
                } else {
                    if(j == 0 || j == 8) {
                        System.out.print('|');        
                    } else if(j == 2 || j == 4 || j == 6) {
                        if(cellsArr[k] == '_'){
                            System.out.print(' ');    
                        } else {
                            System.out.print(cellsArr[k]);
                        }
                        k++;
                    } else {
                        System.out.print(' ');        
                    }
                }
            }
            System.out.println();
        }
    }
}