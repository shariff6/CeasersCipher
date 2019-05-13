import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CeaserCipher {
    public String encodeString(String userWord, int encodingKey) {
        Integer newLetterPosition = 0;
        List<String> mainAlphabet = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        List<String> outPutArray = new ArrayList<String>();

        char[] userInputArray = userWord.toUpperCase().toCharArray();

        for (int i = 1; outPutArray.size() < userWord.length(); i++) {

            for (char plainLetter : userInputArray
            ) {

                Integer letterPosition = mainAlphabet.indexOf(String.valueOf(plainLetter));

                if (letterPosition + encodingKey > 26) {
                    newLetterPosition = ((letterPosition + encodingKey) - (i * 26));
                } else {
                    newLetterPosition = (letterPosition + encodingKey);
                }

                String newLetter = String.valueOf(mainAlphabet.get(newLetterPosition));
                outPutArray.add(newLetter);
            }
        }
        StringBuilder builder = new StringBuilder();
        for ( String letter : outPutArray
             ) {
            builder.append(letter);
        }
        String endodedString = builder.toString();
        return endodedString;

    }
    public String decryptString(String userWord, int encodingKey) {
        Integer newLetterPosition = 0;
        List<String> mainAlphabet = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        List<String> outPutArray = new ArrayList<String>();

        char[] userInputArray = userWord.toUpperCase().toCharArray();

        for (int i = 1; outPutArray.size() < userWord.length(); i++) {

            for (char plainLetter : userInputArray
            ) {

                Integer letterPosition = mainAlphabet.indexOf(String.valueOf(plainLetter));

                if (letterPosition - encodingKey < 0) {
                    newLetterPosition = ((letterPosition - encodingKey) + (i * 26));
                } else {
                    newLetterPosition = (letterPosition - encodingKey);
                }

                String newLetter = String.valueOf(mainAlphabet.get(newLetterPosition));
                outPutArray.add(newLetter);
            }
        }
        StringBuilder builder = new StringBuilder();
        for ( String letter : outPutArray
        ) {
            builder.append(letter);
        }
        String decodedString = builder.toString();
        return decodedString;

    }
}
