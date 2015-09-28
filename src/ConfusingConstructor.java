/**
 * Created by jrowley on 9/27/15.
 */
public class ConfusingConstructor {
    private ConfusingConstructor(Object o) {
        System.out.println("Object");
    }

    private ConfusingConstructor(double[] dArray) {
        System.out.println("double array");
    }

    public static void main(String[] args) {
        new ConfusingConstructor(null);
    }
}
