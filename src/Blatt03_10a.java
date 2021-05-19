import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Blatt03_10a {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 101);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < x; ++i) {
            list.add((int) (Math.random() * 1001));
        }
        System.out.println(list.size());
        if (list.size() % 2 == 1) {
            System.out.println(list.get(list.size() / 2));
        } else {
            System.out.println("Die Anzahl der Elemente ist gerade");
        }
        Integer y = 500;
        if (list.contains(y) == true) {
            System.out.println(list.contains(y));
        } else System.out.println("500 nicht vorhanden");

        int max = 0;
        for (int i = 0; i < list.size(); ++i) {
            int test = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(test);
            }
        }
    }


}

