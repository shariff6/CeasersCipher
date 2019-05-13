import java.io.Console;


public class App {
    public static void main(String[] args) {

        Console myConsole = System.console();

        System.out.println("Welcome, what would you like to do, Encrypt a Phrase, Decrypt A Phrase or Exit");
        String userChoice = myConsole.readLine();
        boolean programRunning = true;
      while (programRunning) {
          if (userChoice.toUpperCase().equals("ENCRYPT")) {
              System.out.println("Enter phrase To Encrypt");
              String userPhrase = myConsole.readLine();
              System.out.println("Enter Encryption Key");
              Integer encodingKey = Integer.parseInt(myConsole.readLine());
              CeaserCipher userInput = new CeaserCipher();
              String encodedString = userInput.encodeString(userPhrase, encodingKey);
              System.out.println(encodedString);
          } else if (userChoice.toUpperCase().equals("DECRYPT")) {
              System.out.println("Enter phrase To Decrypt");
              String userPhrase = myConsole.readLine();
              System.out.println("Enter Decryption Key");
              Integer encodingKey = Integer.parseInt(myConsole.readLine());
              CeaserCipher userInput = new CeaserCipher();
              String decodedString = userInput.decryptString(userPhrase, encodingKey);
              System.out.println(decodedString);
          } else if (userChoice.toUpperCase().equals("EXIT")) {
              programRunning = false;
          }
      }
    }
}
