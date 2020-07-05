import java.util.Scanner;

public class HapusSatuSaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();       

        System.out.println(check(A, B));

        }

    public static String check(String A, String B){
        int difference = 0;
        if(A.length() - B.length() > 1 || A.length() == B.length() || B.length() > A.length()){
            return "Wah, tidak bisa :(";
        }
        for(int i = 0; i < A.length(); i++){
            if( i == A.length() - 1 && A.length() - B.length() == 1){
                B = B + "$";
            }
            if ( B.charAt(i) != A.charAt(i)){
                B = B.substring(0, i) + "$" + B.substring(i);
                difference++;
            }
        }
        if(difference > 1){
            return "Wah, tidak bisa :(";
        } 

        return "Tentu saja bisa!";

    }
}