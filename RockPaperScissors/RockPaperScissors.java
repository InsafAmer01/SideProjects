package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    public static void main (String[] args) {
        String[] moves ={"rock","paper","scissors"};
        Random random = new Random();

        // Randomly choose a number from the array
        int index = random.nextInt(moves.length);
        String chosenNumber = moves[index];


        Scanner scanner = new Scanner(System.in);
        System.out.println("please chose your move:\n1. rock\n2. paper\n3. scissors");
        int move = scanner.nextInt();

        switch (move) {
            case 1:
                if(chosenNumber == "rock"){
                    System.out.println("i picked " +chosenNumber+" its a tie");
                }else if(chosenNumber == "paper"){
                    System.out.println("i picked " +chosenNumber+" you lost");
                }else if(chosenNumber == "scissors"){
                    System.out.println("i picked " +chosenNumber+" you won");
                }
            break;

            case 2:
                if(chosenNumber == "paper"){
                    System.out.println("i picked " +chosenNumber+" its a tie");
                }else if(chosenNumber == "rock"){
                    System.out.println("i picked " +chosenNumber+" you won");
                }else if(chosenNumber == "scissors"){
                    System.out.println("i picked " +chosenNumber+" you lost");
                }
            break;
        

            case 3:
                if(chosenNumber == "scissors"){
                    System.out.println("i picked " +chosenNumber+" its a tie");
                }else if(chosenNumber == "paper"){
                    System.out.println("i picked " +chosenNumber+" you won");
                }else if(chosenNumber == "rock"){
                    System.out.println("i picked " +chosenNumber+" you lost");
                }
            break;

        

        }

    scanner.close();
    
}

}
