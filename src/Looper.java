/**
 * Created by jrowley on 9/26/15.
 */
public class Looper {
    public static void main(String[] args) {
        //Come up with a variable declaration that makes
        //the following loop run indefinitely
        double i = 0;
        while(i == i + 1) {
            System.out.println("I'm still running!");
        }
    }
}
