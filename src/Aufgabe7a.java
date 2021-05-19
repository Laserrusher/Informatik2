public class Aufgabe7a {
    public static void main(String[] args) {

        String a = new String("");
        StringBuilder b = new StringBuilder();
        System.out.println(b);
        for (int i = 0; i < args.length; i++) {
            b.append(args[i]).append(" ");
            System.out.println(b);
        }


        for (int i = 0; i < args.length; i++) {
            a = a.concat(args[i]);
            System.out.println(a);
        }
        String [] c = a.split("-");
        for (int i = 0; i < c.length; i++){
            System.out.println(c[i]);
        }

    }
}
