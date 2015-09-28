/**
 * Created by jrowley on 9/27/15.
 */
public class ExhaustingWorkout {
    public static void main(String[] args) {
        System.out.println("Start: " + System.currentTimeMillis());
        workHard();
        System.out.println("It's nap time");
    }

    private static void workHard() {
        try {
            workHard();
        } finally {
            workHard();
        }
    }
}
