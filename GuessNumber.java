import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        //generate initial random number, range from 0 to 100
        Random random = new Random ();
        int randomNumber = random.nextInt(101);
        //for while loop
        int i = 0;
        //scanner
        Scanner scanner = new Scanner (System.in);
        //take user input
        while (i == 0){  
            System.out.print("Guess the number: ");
            String input = scanner.nextLine();
            if (input.equals("quit")){
                i = i + 1;
            }
            //now make it an integer
            int guess = Integer.parseInt(input);
            //read it and compare to generated random number
            if (guess == randomNumber){
            System.out.print("Congratulations! You Guessed " + randomNumber);
            i = i + 1;
            }
            //if number is lower,
            else if(guess < randomNumber){
            System.out.println("Not quite, your guess is too low.");
            }
            else if (guess > randomNumber){
                System.out.println("Not quite, your guess is too high");
            }

        }
        
    }
    }

