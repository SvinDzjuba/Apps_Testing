package classes;

public class quadratic {

    public double[] quadratic(double a, double b, double c) {
        double discriminant;
        double sqrt = 0.0;
        double sqrt1 = 0.0;
        double sqrt2 = 0.0;

        // Discriminant is ok
        discriminant = Math.pow(b, 2) - (4 * a * c);
        // Discriminant = 0
        if (discriminant == 0) {
            sqrt = -b / (2 * a);
        } else if (discriminant > 0) {
            sqrt1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            sqrt2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        }
        return new double[]{sqrt, sqrt1, sqrt2, discriminant};
    }
}
