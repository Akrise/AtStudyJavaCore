package lesson13.task2;

import homework_solution.lesson13.task2.Modifiers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModifiersTests {

    @Test
    public void invertTest() {
        Assertions.assertTrue(Modifiers.invert.modify(false));
    }

    @Test
    public void absoluteTest() {
        Assertions.assertEquals(30, Modifiers.absolute.modify(-30));
    }

    @Test
    public void reverseTest() {
        Assertions.assertEquals("RQPS", Modifiers.reverse.modify("SPQR"));
    }
}
