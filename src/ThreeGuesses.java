import java.util.*;

public class ThreeGuesses {
    public static void main(String[] args) {
        String guesses;
        String guess;
        String secretPass;

        Scanner input = new Scanner(System.in);
        secretPass = "28";

        System.out.println("Welcome to the People's Bank.");
        System.out.print("Please enter your secret code:");
        guess = input.next();

        if (guess.equals(secretPass))
            System.out.println("Fine, go ahead.");
        else {
            System.out.print("Sorry, that is not it. Try again:");
            guess = input.next();

            if (guess.equals(secretPass))
                System.out.println("Fine, go ahead.");
            else {
                System.out.print("Sorry, last chance. Try again:");
                guess = input.next();

                if (guess.equals(secretPass))
                    System.out.println("Fine, go ahead.");
                else {
                    System.out.println("Sorry, that's too many guesses. Please try again tomorrow.");
                }
            }
        }
    }
}
