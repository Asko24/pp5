package pl.pgalecki.credit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {
    @Test
    public void itGreetsUser(){
        //Arrange
        String name = "Piotr";
        Greeter greeter = new Greeter();
        //Act
        String greetingText = greeter.hello("Piotr");
        //Assertions
        assertEquals("Hello Piotr!", greetingText);
    }
}
