public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
            boolean a, b, c;
            a = b = c = true;

            if( !a || ( b && c ) ) {
                System.out.println("If executed");
            } else {
                System.out.println("else executed");
            }

        }}