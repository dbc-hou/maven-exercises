import org.apache.commons.lang3.StringUtils;

public class FunWithStrings {
    private static StringUtils mySU = new StringUtils();
    private static Input myInput = new Input();

    public static void main(String[] args) {
        // Get String input from user
        System.out.println("Type your full name and place of birth:");
        String userInput = myInput.getString();
        // Determine whether the user has entered a number
        boolean isItANumber = mySU.isNumeric(userInput);
        if (isItANumber) {
            System.out.println("That's interesting! Your name is a number!");
            System.out.println("We need something more textual than that. Please try again.");
            userInput = myInput.getString();
        } else {
            System.out.println("You entered: \"" + userInput + "\"");
            System.out.println("\"" + userInput + "\" is not a number.");
        }
        // Flip the case of the string
        String flipCase = mySU.swapCase(userInput);
        System.out.println("Flipped case: " + flipCase);
        // Reverse the string
        String reverse = mySU.reverse(userInput);
        System.out.println("Reversed: " + reverse);
        // Just for giggles, reversed and case-flipped
        String reverseFlip = mySU.reverse(flipCase);
        System.out.println("Flipped and reversed: " + reverseFlip);

    }
}
