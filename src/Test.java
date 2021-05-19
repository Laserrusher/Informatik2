public class Test {
    public static void main(String[] args) {
        String a = new String("Hello");
        StringBuilder b = new StringBuilder();

        b.append(a + "zusammen");
        System.out.println(b);
    }
}
