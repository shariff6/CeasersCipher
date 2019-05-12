import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CeaserCipher {
    public String encodeString(String userWord, int encodingKey) {
        String encodedWord = "";
        Integer newLetterPosition = 0;
        List<String> mainAlphabet = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        List<String> outPutArray = new ArrayList<String>();

        char[] userInputArray = userWord.toUpperCase().toCharArray();


    }
}
