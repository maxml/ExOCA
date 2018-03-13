import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
	System.out.println("Hello world!");
    }

    private static void exset() {
        ArrayList list = new ArrayList();
        list.add(6);
        list.add(9);
        list.set(1, 8);
        System.out.println(list);
    }

    private static void gotoex() {
        int i = 0, x = 0;
        INNER:
        do {
            i++;
            if (i > 3) break INNER;
            x++;
        } while (i < 30);
        System.out.println(x + i);
    }
}
