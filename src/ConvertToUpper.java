import java.util.*;
/*
Written By Christopher Pucko
If a user enters a single, lowercase letter of the alphabet, it will convert it to uppercase.
In any other case, it'll output an error message.
 */
public class ConvertToUpper {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);

        String lower;
        String upper;

        System.out.print("Enter a letter: ");
        lower = keyin.next();

        if (lower.length() == 1 && lower.matches("[a-z]")) {
            upper = lower.toUpperCase();
            System.out.println("The uppercase equivalent of " + lower + " is " + upper);
        } else if (lower.length() != 1)
            System.out.println("You have entered an incorrect number of characters");
          else if (lower.matches("[A-Z]"))
            System.out.println("This letter is already uppercase");
        else
            System.out.println("Not a letter");
    }
}
