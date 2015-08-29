package src.main.java.test;

/**
 * Created by nitin on 8/29/15.
 */
public class PassByValOrRef {
    public static void main(String args[]) {

        Integer i = 4;

        /**
         * pass by value of pass by reference
         */

        increment(i);
        System.out.println(i);


        String name = "nitin";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String name) {
        name = "sachin";
    }

    private static void increment(Integer i) {
        i++;
    }
}
