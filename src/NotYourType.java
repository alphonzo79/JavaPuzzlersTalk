/**
 * Created by jrowley on 9/27/15.
 */
public class NotYourType {
    public static void main(String[] args) {
        String s = null;
        System.out.println(s instanceof String);

        //System.out.println(new NotYourType() instanceof String);

        NotYourType instance = (NotYourType) new Object();
    }
}
