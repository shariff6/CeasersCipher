import java.io.Console;


public class App {
    public static void main(String[] args) {

        Console myConsole = System.console();

        System.out.println("Welcome, what would you like to do, Encryt a Phrase, Decrypt A Phrase or Exit");
        String userChoice = myConsole.readLine();

        if (userChoice.equals("Encrypt")) {
            System.out.println("Enter phrase To Encrypt");
            String userPhrase = myConsole.readLine();
            System.out.println("Enter Encryption Key");
            Integer encodingKey = Integer.parseInt(myConsole.readLine());
            CeaserCipher userInput = new CeaserCipher();
            String encodedString = userInput.encodeString(userPhrase, encodingKey);
            System.out.println(encodedString);
        }


    }
}
