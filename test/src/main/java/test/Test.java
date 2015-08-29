package src.main.java.test;

/**
 * Created by nitin on 8/29/15.
 */
public class Test {
    public static void main(String args[]) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Iteration" + i);
        }
    }
}
