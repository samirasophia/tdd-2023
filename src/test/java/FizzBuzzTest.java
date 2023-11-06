import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void fizzBuzz_when(){
        //GIVEN
        int number = 1;
        //WHEN
      String actual =  FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals("1", actual);
    }
    @Test
    void fizzBuzz_when2(){
        //GIVEN
        int number2 = 2;
        //WHEN
        String actual =  FizzBuzz.fizzBuzz(number2);
        //THEN
        assertEquals("2", actual);
    }

    @Test
    void fizzBuzz_when3(){
        //GIVEN
        int number3 = 3;
        //WHEN
        String actual =  FizzBuzz.fizzBuzz(number3);
        //THEN
        assertEquals("Fizz", actual);
    }

    @Test
    void fizzBuzz_when5(){
        //GIVEN
        int number5 = 5;
        //WHEN
        String actual =  FizzBuzz.fizzBuzz(number5);
        //THEN
        assertEquals("Buzz", actual);
    }
    @Test
    void fizzBuzz_when15(){
        //GIVEN
        int number15 = 15;
        //WHEN
        String actual =  FizzBuzz.fizzBuzz(number15);
        //THEN
        assertEquals("Fizzbuzz!", actual);
    }

}
