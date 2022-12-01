public class UsingLambdas {
    public static void testAll() {
        Bno bno = new Bno();
        Ano ano = Bno::printer; // method reference
        // Ano bno = (b) -> b.printer(); // lambda override for FunctionalInterface's abstract method
        ano.print(bno);
    }
}

class Bno {
    String b = "bno works";

    public void printer() {
        System.out.println(b);
    }
}

@FunctionalInterface
interface Ano {
    public abstract void print(Bno b);
}