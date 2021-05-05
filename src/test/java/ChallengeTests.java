import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTests {

    @Test
    public void test() {
        Assertions.assertEquals(4, Challenge.maxRemovedChars("RUDRL"));
        Assertions.assertEquals(4, Challenge.maxRemovedChars("UDLR"));
        Assertions.assertEquals(0, Challenge.maxRemovedChars("RRUU"));
        Assertions.assertEquals(4, Challenge.maxRemovedChars("DDLLUUU"));
        Assertions.assertEquals(0, Challenge.maxRemovedChars("RRRDDD"));
        Assertions.assertEquals(2, Challenge.maxRemovedChars("RULLU"));
    }
}
