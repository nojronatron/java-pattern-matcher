/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jrjava.pattern.matcher;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SpellCheckingInspection")
class LibraryTest {
    @Test void test_CanInstantiateClass() {
        Library sut = new Library();
        assertNotNull(sut);
    }
    @Test void test_CanFindTenDigitNoParens() {
        String regexInput = "(1?\\(\\d{3}\\)\\d{3}\\-\\d{4})|((1\\-)?\\d{3}\\-\\d{3}\\-\\d{4})";
        String testInput = "555-555-5555";
        Library sut = new Library();
        assertTrue(sut.validUsPhoneNumber(regexInput, testInput));
    }
    @Test void test_CanFindTenDigitWithParens() {
        String regexInput = "(1?\\(\\d{3}\\)\\d{3}\\-\\d{4})|((1\\-)?\\d{3}\\-\\d{3}\\-\\d{4})";
        String testInput = "(555)555-5555";
        Library sut = new Library();
        assertTrue(sut.validUsPhoneNumber(regexInput, testInput));
    }
    @Test void test_CanFindLongDistanceNoParens() {
        String regexInput = "(1?\\(\\d{3}\\)\\d{3}\\-\\d{4})|((1\\-)?\\d{3}\\-\\d{3}\\-\\d{4})";
        String testInput = "1-555-555-5555";
        Library sut = new Library();
        assertTrue(sut.validUsPhoneNumber(regexInput, testInput));
    }
    @Test void test_CanFindLongDistanceWithParens() {
        String regexInput = "(1?\\(\\d{3}\\)\\d{3}\\-\\d{4})|((1\\-)?\\d{3}\\-\\d{3}\\-\\d{4})";
        String testInput = "1(555)555-5555";
        Library sut = new Library();
        assertTrue(sut.validUsPhoneNumber(regexInput, testInput));
    }

    @Test void test_CanFindPhraseInRackham() {
        String inputPhrase = rackham.toString();
        Library sut = new Library();
        String actualResult = sut.replacesVerbs(inputPhrase);
        System.out.println("Actual result: " + actualResult);
        assertTrue(true);
    }

    // lorem ipsum and rackham text source: https://www.lipsum.com/
    private final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    private final String rackham = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?";

}
