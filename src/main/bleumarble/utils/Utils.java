package main.bleumarble.utils;

public class Utils {
    public static int safeParseInteger(String input) {
        try{
            return Integer.parseInt(input);
        } catch (NumberFormatException  e) {
            return -1;
        }
    }



}
