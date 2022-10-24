import java.text.NumberFormat;

public class UsingStringBuilder {
    public static void testAll() {
        StringBuilder sb = new StringBuilder();
        sb
            .append("Hello")
            .append(" ")
            .append("World");
        System.out.println(sb.toString());

        NumberFormat numF = NumberFormat.getNumberInstance();
        System.out.println("Number Formatted: " + numF.format(1234567890.99));

        NumberFormat currencyF = NumberFormat.getCurrencyInstance();
        System.out.println("Currency Formatted: " + currencyF.format(1234567890.99));

        BasicCalculator.on();
    }
}
