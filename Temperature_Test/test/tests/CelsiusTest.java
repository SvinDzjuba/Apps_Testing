package tests;

import classes.temperature;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CelsiusTest {

    public CelsiusTest() {}
    
    @Test
    public void celsius_test1() {
        temperature obj = new temperature();
        double celsius = obj.celsius_calculation(104);
        assertEquals(6.6, celsius, 0.1);
    }
    @Test
    public void celsius_test2() {
        temperature obj = new temperature();
        double celsius = obj.celsius_calculation(-50);
        assertEquals(-40, celsius, 0.1);
    }
    @Test
    public void celsius_test3() {
        temperature obj = new temperature();
        double celsius = obj.celsius_calculation(-21.5);
        assertEquals(-41, celsius, 0.1);
    }
    @Test
    public void celsius_test4() {
        temperature obj = new temperature();
        double celsius = obj.celsius_calculation(0);
        assertEquals(12, celsius, 0.1);
    }
}
