import java.util.TreeSet;

public class Blatt03_10d {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 101);
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < x; i++){
            set.add((int) (Math.random()*1001));
        }
        if (set.size() % 2 == 1){
            System.out.println("Die Anzahl ist ungerade");
        }else{
            System.out.println("Die Anzahl ist gerade");
        }
        System.out.println(set.size());

        Integer test = 500;
        if (set.contains(test) == true){
            System.out.println("500 vorhande");
        }else{
            System.out.println("500 nicht vorhanden");
        }
        System.out.println(set.last());
    }

}
