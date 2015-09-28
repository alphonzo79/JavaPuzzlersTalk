/**
 * Created by jrowley on 9/27/15.
 */
public class NullAndVoid {
    public static void greet() {
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        ((NullAndVoid)null).greet();
    }
}
