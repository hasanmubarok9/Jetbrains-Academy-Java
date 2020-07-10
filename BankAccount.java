import java.util.Scanner;
import java.util.Random;

class BankAccount {
    public static void main(String[] args) {
        boolean exit = false;
        boolean isLogin = false;
        String[][] users = new String[10][2];
        int k = 0;
        while (!exit){
            if(isLogin){
                System.out.println("1. Balance");
                System.out.println("2. Log out");
            } else {
                System.out.println("1. Create an account");
                System.out.println("2. Log into account");
            }
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);

            int input = scanner.nextInt();            
            switch (input){
                case 0:
                    System.out.println("Bye!");
                    exit = true;
                    break;
                case 1:                   
                    if (isLogin){
                        System.out.println("Balance: 0");
                    } else {                        
                        Random random = new Random();
                        long customerDigitNumber = 1 + random.nextInt(9); // ensures that the 16th digit isn't 0
                            for(int i = 0; i < 8; i++) {
                                customerDigitNumber *= 10L;
                                customerDigitNumber += random.nextInt(10);
                            }
                        String creditCardNumber = "400000" + Long.toString(customerDigitNumber) + "8";
                        String PIN = String.format("%04d", random.nextInt(10000));
                        System.out.println("Your card has been created");
                        System.out.println("Your card number:");
                        System.out.println(creditCardNumber);
                        users[k][0] = creditCardNumber;
                        System.out.println("Your card PIN:");
                        System.out.println(PIN);
                        users[k][1] = PIN;
                        k++;
                    }
                    break;
                case 2:
                    if (isLogin){
                        isLogin = false;
                        System.out.println("You have successfully logged out!");
                    } else {
                        System.out.println("Enter your card number:");
                        scanner.nextLine();
                        String cardNumber = scanner.nextLine();
                        System.out.println("Enter your PIN:");
                        String PIN = scanner.nextLine();
                        boolean found = false;
                        for (int j = 0; j < users.length; j++){
                            if ( cardNumber.equals(users[j][0]) ){
                                found = true;
                                if (!PIN.equals(users[j][1])){
                                    System.out.println("Wrong card number or PIN!");
                                } else {
                                    isLogin = true;
                                    System.out.println("You have successfully logged in!");
                                }
                            }
                        }
                        if(!found){
                            System.out.println("Wrong card number or PIN!");
                        }
                    }
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
        }
    }
}