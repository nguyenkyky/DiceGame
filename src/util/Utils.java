package util;

import java.util.List;
import java.util.Scanner;

public class Utils {

    private static final Scanner sc = new Scanner(System.in);
    public static int getRandomElement(List<Integer> a) {
        int n = a.size();
        return a.get((int)(Math.random()*n));
    }

    public static Scanner getScanner() {
        return sc;
    }
}
