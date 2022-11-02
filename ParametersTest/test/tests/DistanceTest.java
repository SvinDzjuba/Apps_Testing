package tests;

import calculation.Distance;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DistanceTest {
    private final double x1;
    private final double x2;
    private final double y1;
    private final double y2;
    private final double final_distance;
    private Distance distance;
    
    @Before
    public void initialize() {
        distance = new Distance();
    }

    @Parameters
    public static Collection distance_values() {
        return Arrays.asList(new Object[][] {
            {1, 2, 3, 4, 2},
            {5, -6, 7, 8, 2.74},
            {-9, 10, 11, 12, 5.97}
        });
    }
    
    public DistanceTest(double x1, double x2, double y1, double y2, double final_distance) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.final_distance = final_distance;
    }

    @Test
    public void distance_test1() {
        assertEquals(final_distance, distance.calculate_distance(x1, x2, y1, y2), 0.01);
    }
}
