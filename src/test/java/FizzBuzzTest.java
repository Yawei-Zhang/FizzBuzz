import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void shouldReturnFizzWhenProcess3Given3() {
        int input = 3;

        FizzBuzz fb = new FizzBuzz();
        String result = fb.process(input);

        assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzWhenProcess5Given5() {
        int input = 5;

        FizzBuzz fb = new FizzBuzz();
        String result = fb.process(input);

        assertEquals("Buzz", result);
    }
}
