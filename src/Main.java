public class Main {
    public static void main(String[] args)
    throws java.io.IOException {

        char ch;

        do {
            ch = (char) System.in.read();
        } while (ch != 'q');
        System.out.println("You pressed q!");
    }
}