package academy.learnprogramming;

import com.sun.jdi.ShortType;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        // 32width
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Blah " + myMinIntValue);

        // 8width
        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxValue = Byte.MAX_VALUE;

        System.out.println("min" + myMinByte);
        System.out.println("max" + myMaxValue);

        // 16width
        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;

        System.out.println("min" + myMinShort);
        System.out.println("max" + myMaxShort);

        // 64width
        // for literals, must add L to specify as long and not treated as integer
        long myLong = 100L;

        // casting
        // converting type, int is the "default"
        byte myCastedByte = (byte)(myMinByte / 2);

        // always use an integer unless you have a reason not to

        //challenge:

        byte cutieByte = 10;
        short cutieShort = 20;
        int cutieInt = 50;

        long bigLong = (long)(50000 + 10 * (cutieByte + cutieInt + cutieShort));

        //OR (casting was not necessary with long, but would have been w/ short)
        long longTotal = 50000L + 10L * (cutieByte + cutieShort + cutieInt);
        System.out.println("******* " + bigLong);
        System.out.println("+++++++ " + longTotal);
    }
}
