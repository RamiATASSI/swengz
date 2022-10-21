import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Class for the quiz parser tests.
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * You MUST use this file for quiz parser tests.
 * You CAN add new constructors, methods, and nested classes to this class.
 * You MUST NOT rename this file.
 * You MUST NOT delete this file.
 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
final class QuizParserTests {

    private QuizParser parser = new QuizParser();

    @Test
    void nullTextIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(null) );
    }
    @Test
    void noTextIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse("") );
    }
    @Test
    void textWithoutDieseIsInvalid() {
        assertThrows(QuizFormatException.class, () -> parser.parse("blabla") );
    }
    @Test
    void questionWithoutAnswerIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> parser.parse(null) );
    }

}
