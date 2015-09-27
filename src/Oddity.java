/**
 * Created by jrowley on 9/26/15.
 */
public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static boolean isOddFixed(int i) {
        return i % 2 != 0;
    }

    public static boolean isOddPerformant(int i) {
        return (i & 1) != 0;
    }

    public static void main(String[] args) {
        int oddCounter = 0;
        int evenCounter = 0;
        for(long i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            if(isOdd((int)i)) {
                oddCounter++;
            } else {
                evenCounter++;
            }
        }
        System.out.println(String.format("Even: %d Odd: %d", evenCounter, oddCounter));

//        oddCounter = 0;
//        evenCounter = 0;
//        long start = System.currentTimeMillis();
//        for(long i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
//            if(isOddFixed((int)i)) {
//                oddCounter++;
//            } else {
//                evenCounter++;
//            }
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(String.format("Even: %d Odd: %d Time: %d", evenCounter, oddCounter, end - start));
//
//        oddCounter = 0;
//        evenCounter = 0;
//        start = System.currentTimeMillis();
//        for(long i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
//            if(isOddPerformant((int)i)) {
//                oddCounter++;
//            } else {
//                evenCounter++;
//            }
//        }
//        end = System.currentTimeMillis();
//        System.out.println(String.format("Even: %d Odd: %d Time: %d", evenCounter, oddCounter, end - start));
    }
}
