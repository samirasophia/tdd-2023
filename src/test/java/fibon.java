import org.example.FizzBuzz;
import org.example.fibonacci;
import org.example.meow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fibon {

    @Test
    void fibon(){
        //GIVEN
      int durchgaenge = 3;

        //WHEN

        int actual = (fibonacci.fibonacc(durchgaenge));

        //THEN
        assertEquals(3, actual);
    }}