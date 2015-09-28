/**
 * Created by jrowley on 9/27/15.
 */
public class WhatsThePoint extends Point {
    private final String color;

    WhatsThePoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    protected String makeName() {
        return super.makeName() + ":" + color;
    }

    public static void main(String[] args) {
        System.out.println(new WhatsThePoint(4, 2, "purple)"));
    }
}

class Point {
    private final int x, y;
    private final String name;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        name = makeName();
    }

    protected String makeName() {
        return "[" + x + "," + y + "]";
    }

    public final String toString() {
        return name;
    }
}
