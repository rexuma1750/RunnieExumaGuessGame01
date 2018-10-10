import java.util.Scanner;

public class GuessGame {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        String guess = "0.5";
        System.out.print("Guess a number between 0 and 1.");
        while (!guess.equals(input)) {
            System.out.println("Guess again");
        }
        System.out.println("You got i! The number is" + guess + "!");
    }

    public static void 
}
