import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CeaserCipherTest {
    @Test
    public void encodeString_InstantiatesCorrectly() {
        CeaserCipher testCipher = new CeaserCipher();
        assertEquals(true, testCipher instanceof  CeaserCipher);
    }

    @Test
    public void encodeString_returnsReplacementOf1stLetterOfUserInputOnKey() {
        CeaserCipher testCipher = new CeaserCipher();
        String testInput = "Dog";
        assertEquals("FQI", testCipher.encodeString(testInput, 2));

    }
    @Test
    public void encodeString_returnsEncodedStringOfUserInput() {
        CeaserCipher testCipher = new CeaserCipher();
        String testInput = "Dog";
        assertEquals("FQI", testCipher.encodeString(testInput, 2));

    }
    @Test
    public void encodeString_returnsEncodedStringRegardlessOfCaseOfUserInput(){
        CeaserCipher testCipher = new CeaserCipher();
        String testInput = "DoG";
        assertEquals("FQI", testCipher.encodeString(testInput, 2));

    }




}
