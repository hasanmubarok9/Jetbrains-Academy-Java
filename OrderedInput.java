// Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered (in ascending or descending order), otherwise, false. Keep in mind, if a number has the same value as the following number, it does not break the order.

// The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).

// Sample Input 1:

// 9 8 7 6 5 4 3 2 1 0
// Sample Output 1:

// true
// Sample Input 2:

// 1 2 3 3 9 0
// Sample Output 2:

// true
// Sample Input 3:

// 1 2 5 5 2 3 0
// Sample Output 3:

// false

import java.util.Scanner;

class OrderedInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int past = scanner.nextInt();
        boolean isAscending = true;
        boolean isDescending = true;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x == 0) {
                break;
            } else if (x >= past) {
                isDescending = false;
            } else {
                isAscending = false;
            }
            past = x;
        }
        System.out.println(isAscending || isDescending);
    }
}
