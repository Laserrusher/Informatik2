public class Aufgabe7b {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < args.length; i++) {
            s.insert(0, args[0]);
            System.out.println(s.toString());
        }
        s.reverse();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                s.setCharAt(i, '_');
            }
        }
        System.out.println(s.toString());

    }
}
