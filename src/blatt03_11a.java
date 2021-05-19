import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class blatt03_11a {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 101);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < x; i++){
            Integer y = (int) (Math.random() * 10001);
            list.add(y);
        }

    }

    public static void removeIf(ArrayList<Integer> list){
        Iterator it = list.iterator();
        while (it.hasNext()){
            Integer zahl = (Integer) it.next();
            if (zahl % 2 == 1){
                it.remove();
            }
        }
    }

    public static void forEach(ArrayList<Integer> list){
        for(Integer zahl : list){
            if (zahl > 900){
                System.out.println(zahl);
            }
        }
    }



}
