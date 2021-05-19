class blatt1 {

    public static void main(String[] args) {
        double a = myRandom();
        System.out.println("mySum(" + a + ") = " + mySum(a));

        //System.out.println("myGT(" + a + ") = " + myGT(a));


    }

    public static void aufgabe3a (String [] args){
        System.out.println("Es wurden " + args.length + " Kommandozeilenparameter übergeben.");
    }
    public static void aufgabe3b (String [] args) {
        if (args[0] != null) {
            System.out.println(args[0].charAt(args[0].length()-1));
        } else {
            System.out.println("Keine Kommandozeilenparameter");
        }
    }
    public static void aufgabe3c (String [] args) {
        if (args.length == 1){
            System.out.println(args[0].indexOf("x") + 1 );
        }else {
            System.err.println("Fehler");
        }
    }

    public static void aufgabe3d (String [] args) {
        if (args.length == 2){
            if (args[0].compareTo(args[1]) == 0){
                System.out.println("Beide Parameter sind gleich");
            }else if (args[0].compareTo(args[1]) > 0){
                System.out.println("Der 1. Parameter ist lexikographisch nach dem 2.");
            }else {
                System.out.println("Der 2. Parameter ist lexikographisch nach dem 1.");
            }
        } else{
            System.err.println("Fehler");
        }
    }

    public static double myRandom(){
        double a = Math.floor(Math.random() * (10000 - 1)) + 1;
        System.out.println(Math.floor(Math.random() * (10000 - 1)) + 1);
        return a;
    }

    public static double mySum(double x){
        double sum = 0;
        for (int i = 1; i <= x ; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }
        return sum;
    }




}