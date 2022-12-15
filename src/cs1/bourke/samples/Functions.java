package cs1.bourke.samples;

public class Functions {
    public static String convertRGBToCMYK(int r, int g, int b) {
        double r1 = r / 255.0;
        double g1 = g /255.0;
        double b1 = b / 255.0;

        double max;

        if (r > g) max = Math.max(r, b);
        else max = Math.max(g, b);

        double k = 1 - max;
        double c = (1 - r1 - k) / (1 - k);
        double m = (1 - g1 - k) / (1 - k);
        double y = (1 - b1 - k) / (1 - k);
        return String.format("cmyk(%f, %f, %f, %f)", c, m, y, k);
    }

    public static String convertCMYKToRGB(double c, double m, double y, int k) {
        int r = (int)(255 * (1 - c) * (1 - k));
        int g = (int)(255 * (1 - m) * (1 - k));
        int b = (int)(255 * (1 - y) * (1 - k));
        return String.format("rgb(%d, %d, %d)", r, g, b);
    }

    public static int toAvgGrayscale(int r, int g, int b) {
        return (r + g + b) / 3;
    }

    public static int toLightnessGrayscale(int r, int g, int b) {
        int max = r > g ? Math.max(r, b) : Math.max(b, g);
        int min = r < g ? Math.min(r, b) : Math.min(b, g);
        return (max + min) / 2;
    }

    public static int toLuminosityGrayscale(int r, int g, int b) {
        return (int) ((0.21 * r) + (0.72 * g) + (0.07 * b));
    }

    public static double convertKilometerToMile(double k) {
        return k * (1 / 1.609347219);
    }

    public static double convertMileToKilometer(double mi) {
        return mi * 1.609347219;
    }
}
