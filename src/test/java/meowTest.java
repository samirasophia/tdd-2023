import org.example.FizzBuzz;
import org.example.meow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class meowTest {

    @Test
    void Spielbrett_when(){
        //GIVEN
        int o = 5;
        int[][] brett = new int[10][10];
        //WHEN
        String actual = String.valueOf(meow.w(brett, o));

        //THEN
        assertEquals("1", actual);
    }
    @Test
    void Spielbrett_when1(){
        //GIVEN
     int n = 1;
     int y = 1;

        //WHEN
        String actual = String.valueOf(meow.start1(n, y));

        //THEN
        assertEquals("0", "0", actual);
    }
}
