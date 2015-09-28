import java.util.Calendar;

/**
 * Created by jrowley on 9/27/15.
 */
public class LargerThanLife {
    public static final LargerThanLife INSTANCE = new LargerThanLife();
    private final int beltSize;
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    private LargerThanLife() {
        beltSize = CURRENT_YEAR - 1930;
    }

    public int beltSize() {
        return beltSize;
    }

    public static void main(String[] args) {
        System.out.println("Elvis wears a size " + INSTANCE.beltSize() + " belt.");
    }
}
