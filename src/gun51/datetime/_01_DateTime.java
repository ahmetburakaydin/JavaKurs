package gun51.datetime;

import java.time.LocalTime;

public class _01_DateTime {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();

        int a =0;

        for (int i = 0; i < 1_000_000_000; i++) {
            a+=i;
        }

        LocalTime t2 = LocalTime.now();

        System.out.println(t1+ ","+t2);

    }
}
