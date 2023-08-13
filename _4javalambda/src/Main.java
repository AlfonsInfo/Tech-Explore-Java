import lambda.SimpleAction;

public class Main {
    public static void main(String[] args) {

        /** Menggunakan Anony Class*/
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "Ini Menggunakan Anonymous Class";
            }
        };

        SimpleAction simpleAction1 = () -> "Ini menggunakan Lambda";

        System.out.println(simpleAction.action());
        System.out.println(simpleAction1.action());
    }
}