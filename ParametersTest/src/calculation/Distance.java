package calculation;

public class Distance {
    public double calculate_distance(final double x1, final double x2, final double y1, final double y2) {
        return Math.sqrt(Math.pow(2, (x2 - x1)) + Math.pow(2, (y2 - y1)));
    }
}
