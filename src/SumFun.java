/**
 * Created by jrowley on 9/27/15.
 */
public class SumFun {
    public static void main(String[] args) {
        System.out.println(Cache.getSum());
    }
}

class Cache {
    static {
        initializeIfNecessary();
    }

    private static int sum;
    public static int getSum() {
        initializeIfNecessary();
        return sum;
    }

    private static boolean initialized = false;
    private static synchronized void initializeIfNecessary() {
        if(!initialized) {
            // The sum of integers from 1 to n is n(n + 1)/2
            // 99(100)/2 = 4950
            for(int i = 0; i < 100; i++) {
                sum += i;
            }
            initialized = true;
        }
    }
}
