/**
 * Created by jrowley on 9/26/15.
 */
public class Indecision {
    public static void main(String[] args) {
        System.out.println(decision());
    }

    static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }
    }
}
