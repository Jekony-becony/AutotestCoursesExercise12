package org.example;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.example.App.calculateSquare;
import static org.junit.Assert.assertEquals;

public class TriangleTest {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(4.61, calculateSquare(2.4, 4, 5.2), 0.15);
        logger.info("Test ended!");

    }

}
