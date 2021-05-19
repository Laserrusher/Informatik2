import java.util.Comparator;

public class Blatt3 {

    public static void main(String[] args) {
        /*
        Aufgabe 9b
        Number n = Double.valueOf(13.0);
        isNan(n);
        Number m = newNumb(n);
        System.out.println(m);
        n = null;
        System.out.println(n);
        System.out.println(m);
        new Double(123.5);
        */

    }

    public static void isNan(Number n){
        System.out.println(Double.isNaN(n.doubleValue()));
    }

    public static Number newNumb(Number n){
        Number b = n;
        return b;
    }

    public static Number nullPoint(Number n){
        return null;
    }


}
