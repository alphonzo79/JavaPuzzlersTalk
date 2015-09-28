import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jrowley on 9/27/15.
 */
public class WhatsTheDifference {
    public static void main(String[] args) {
        int vals[] = { 789, 678, 567, 456, 345, 234, 123, 012 };
        Set<Integer> diffs = new HashSet<Integer>();

        for(int i = 0; i < vals.length; i++) {
            for(int j = i; j < vals.length; j++) {
                diffs.add(vals[i] - vals[j]);
            }
        }

        System.out.println(diffs.size());
        //System.out.println(diffs);
    }
}
