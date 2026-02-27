package org;

public class Exercise_Fourth {
    public static void main(String[] args) {
        anograma();
    }

    public static void bubbleSorting() {
        int[] masiv = {5, 4, 3, 2, 6, 7, 8, 9, 0, 1, 9, 7, 5};
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv.length - 1; j++) {
                if (masiv[j] >= masiv[j + 1]) {
                    int temp = masiv[j];
                    masiv[j] = masiv[j + 1];
                    masiv[j + 1] = temp;
                }
            }
        }
        for (int i : masiv) {
            System.out.println(i);
        }
    }

    public static void masivBidimensional() {
        int[][] masiv = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < masiv.length; i++) {
            for (int j = 0; j < masiv.length; j++) {
                if (masiv[i] == masiv[j]) {
                    System.out.println(masiv[i][j]);
                }
            }
        }
    }


    public static void anograma() {
        String word1 = "silent";
        String word2 = "listen";
        if (word1.length() != word2.length()) {
            System.out.println("false");
            return;
        }
        char[] unu = word1.toCharArray();
        char[] doi = word2.toCharArray();
        boolean b = true;
        for (int i = 0; i < unu.length; i++) {
            boolean found = false;
            for (int j = 0; j < doi.length; j++) {
                if (unu[i] == doi[j]) {
                    found = true;
                    doi[j] = '*';
                    break;
                }
            }
            if (!found) {
                b = false;
                break;
            }
        }
        System.out.println(b);
    }
}
