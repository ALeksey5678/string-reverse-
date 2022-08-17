import com.company.reverse.Reverse;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
   private Reverse reverse = new Reverse();

    @Test
    void shouldReverseWordWithDigitsUnchanged() {
        assertEquals("dcba1", reverse.getReversed("abcd1"));
    }

    @Test
    void shouldReplaceDigitsSpacesSymbols() {
        assertEquals("!b1 !A2", reverse.getReversed("!A1 !b2"));
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,()-> reverse.getReversed(null));
    }

    @Test
    void shouldNotReplaceDigitsAndSymbols() {
        assertEquals("!1asd2!", reverse.getReversed("!1dsa2!"));
    }
}