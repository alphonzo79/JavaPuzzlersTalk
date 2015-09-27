/**
 * Created by jrowley on 9/26/15.
 */
public class HelloGoodbye {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World.");
            System.exit(0);
        } finally {
            System.out.println("Goodbye World.");
        }

//        System.out.println("Hello World.");
//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            public void run() {
//                System.out.println("Goodbye World");
//            }
//        });
    }
}
