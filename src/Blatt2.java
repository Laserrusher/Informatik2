import java.util.Random;

public class Blatt2 {

    public static void main(String[] args) {
        aufgabe6c();
        double b = 2;

    }

    public static void aufgabe6a() {
        int a = (int) (Math.random() * 257);
        System.out.println(a);
        char b = (char) a;
        System.out.println("Name des Buchstaben: " + b);
        if (Character.isLowerCase(b) == true) {
            System.out.println("Großbuchstabe ist :" + (char) a + 32);
        }
    }

    public static void aufgabe6b(){
        Random a = new Random();
        int b = a.nextInt();
        System.out.println("DezimalZahl: " + b);
        System.out.println("Binärzahl: " + Integer.toBinaryString(b));
        System.out.println("Okatzahl: " + Integer.toOctalString(b));
        System.out.println("Hexadeziamlzahl: " + Integer.toHexString(b));
        System.out.println("Anzahl der 1-Bits: " + Integer.bitCount(b));
        System.out.println("Anzahl der führenden 0-Bits: " + Integer.numberOfLeadingZeros(b));
        System.out.println("Zahl bei der Umkehrung der Bits: " + Integer.reverseBytes(b));
    }

    public static void aufgabe6c(){
        Random a = new Random();
        double b = a.nextDouble() * ((double) a.nextInt());
        System.out.println(b);
        int c = (int) (Math.random() * 1000);
        System.out.println(c);
        double x = Math.pow(b,c);
        System.out.println(x);
        if (Double.isNaN(x) == true){
            System.out.println("1/x ist Nan");
        }
        if(Double.isInfinite(1/x) == true){
            System.out.println("1/x ist Unendlich");
        }

    }


}
