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

}
