import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

final class ExerciseTests {
    @Test
    void onePlusOneIsTwo() {
        assertThat(1 + 1, is(2));
    }

    @Test
    void testFibzero() {
        assertThat(Functions.fibonacci(0), is(0));
    }
    @Test
    void testFibOne() {
        assertThat(Functions.fibonacci(1), is(1));
    }
    // TODO: tests!
    // Remember "assertThat" with matchers (see the documentation!)
    // and "assertThrows" to assert an exception is thrown
}
