import java.util.Scanner;
public class GuessTheWord {
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);

        String secretWord = "hello";
        int attempts = 5;
         System.out.println("Welcome to Guess the Word Game");
         System.out.println("You have " + attempts + " attempts to guess the word.");

         StringBuilder guessedWord = new StringBuilder("_".repeat(secretWord.length()));

         while (attempts > 0) {
             System.out.println("Current word: " +guessedWord);
             System.out.println("Enter a letter  or the entire word: ");
             String guess = scanner.nextLine().toLowerCase();

             if (guess.equals(secretWord)) {
                 System.out.println("Congratulations!  You guessed the word'" + secretWord + "'.");
                 break;
             } else if (guess.length() ==  1 && secretWord.contains(guess)) {
                 for (int i = 0; i < secretWord.length(); i++){
                     if(secretWord.charAt(i) == guess.charAt(0)) {
                         guessedWord.setCharAt(i, guess.charAt(0));
                     }
                 }
                 if (!guessedWord.toString().contains("_")){
                     System.out.println("Congratulations!  You guessed the word'" + secretWord + "'.");
                     break;
                 }
             } else {
                 System.out.println("Incorrect guess. Try  again. ");
                 attempts --;
                 System.out.println("Attempts left: " + attempts);
                 if (attempts == 0) {
                     System.out.println("Sorry you have run out of attempts. The word was '" + secretWord + "'.");

                 }
             }
         }
scanner.close();
    }
}
