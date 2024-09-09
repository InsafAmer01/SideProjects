package decode;

import java.util.Scanner;

public class Decode {
    public static void main (String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your Visa card number:");
            String cardNumber = scanner.nextLine();
    
            String encodedCardNumber = maskCardNumber(cardNumber);

            System.out.println("Encoded Visa card number: " + encodedCardNumber);
    
            scanner.close();
        }
    
        public static String maskCardNumber(String cardNumber) {
            if (cardNumber.length() < 3) {
                return cardNumber;
            }
            
            // Calculate the position to start showing digits
            int unmaskedStartIndex = cardNumber.length() - 3;
    
            StringBuilder maskedCardNumber = new StringBuilder();
            
            // Append asterisks for the masked part
            for (int i = 0; i < unmaskedStartIndex; i++) {
                maskedCardNumber.append('*');
            }
            
            // Append the last three digits
            maskedCardNumber.append(cardNumber.substring(unmaskedStartIndex));
            return maskedCardNumber.toString();
        }
    }