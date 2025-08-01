package mylib;

public class MyStringUtils {
    public static String doubleString(String s) {
        return s + s;
    }

    public static String reverseAndDouble(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString() + sb.reverse().toString();
    }
}