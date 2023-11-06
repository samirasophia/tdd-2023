import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void fizzBuzz_when(){
        //GIVEN
        int number = 1;
        //WHEN
      int actual =  FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals(1, actual);
    }
}
