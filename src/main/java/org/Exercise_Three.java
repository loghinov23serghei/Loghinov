package org;

import java.util.HashMap;
import java.util.Map;

public class Exercise_Three {
    public static void main (String[] args){

        int[] masiv = {1, 2, 3, 4, 5, 6, 7, 8, 6, 5, 4, 3, 2, 7, 8, 9, 1, 0, 4, 5, 8, 9};
        Map<Integer, Integer> map =mapElements(masiv);
        System.out.println(map);
    }

    public static Map<Integer, Integer> mapElements(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], map.getOrDefault(numbers[i], 0) + 1);
        }
        return map;
    }

    public static int[] primNumber(int[] array) {

        int[] masiv = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (impartirea(array[i])) {
                masiv[count] = array[i];
                count++;
            }
        }
        int[] prim = new int[count];
        for (int i = 0; i < prim.length; i++) {
            prim[i] = masiv[i];
        }
        return prim;
    }

    public static boolean impartirea(int numar) {
        for (int j = numar / 2; j >= 2; j--) {
            if (numar % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean againPolindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int j = str.length() - 1 - i;
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
