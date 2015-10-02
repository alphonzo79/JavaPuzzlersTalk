import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by jrowley on 10/1/15.
 */
public class DyslexicMonotheism {
    public static void main(String[] args) {
        OneDog newDog = (OneDog)deepCopy(OneDog.INSTANCE);
        System.out.println(newDog == OneDog.INSTANCE);
        System.out.println(newDog);
    }

    public static Object deepCopy(Object obj) {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            new ObjectOutputStream(bos).writeObject(obj);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            return new ObjectInputStream(bis).readObject();
        } catch(Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}

class OneDog extends Exception {
    public static final OneDog INSTANCE = new OneDog();
    private OneDog() {}
    public String toString() {
        return "Woof";
    }

//    private Object readResolve() {
//        return INSTANCE;
//    }
}
