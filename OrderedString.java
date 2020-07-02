import java.util.Scanner;

class OrderedString {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        String[] array = scanner.nextLine().split(" ");
        
        String past = array[0];
        boolean ordered = true;
        
        for( int i = 1; i < array.length; i++) {

            if( past.compareTo(array[i]) > 0) {
                ordered = false;
                break;
            }
            
            past = array[i];
        }
        
        System.out.println(ordered);
    }
}