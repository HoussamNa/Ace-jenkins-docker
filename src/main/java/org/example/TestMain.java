package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMain {

    @Test
    public void testInputIsEven(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(23));
        assertFalse(Main.checkIfInputIsAnEvenNumber(22));
    }
}
