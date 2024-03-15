package AD_2.Lab4;

import java.util.*;

/**
 * Rabin_Karp_Algo
 */
public class Rabin_Karp_Algo {
    public static int search(String text, String pattern) {
        char[] textArray = text.toCharArray();
        char[] patternArray = pattern.toCharArray();
        int n = text.length();
        int m = pattern.length();
        int i, j;
        int prime = 101;
        int pown = 1;
        int textHash = 0, patternHash = 0;

        if (m == 0 || m > n) {
            return -1;
        }

        for (i = 0; i < m - 1; i++) {
            pown = (pown << 1) % prime;
        }

        for (i = 0; i < m; i++) {
            patternHash = ((patternHash << 1) + patternArray[i]) % prime;
            textHash = ((textHash << 1) + textArray[i]) % prime;
        }

        for (i = 0; i <= (n - m); i++) {
            if (textHash == patternHash) {
                for (j = 0; j < m; j++) {
                    if (textArray[i + j] != patternArray[j]) {
                        break;
                    }
                }
                if (j == m) {
                    return i;
                }
            }
            if (i < n - m) {
                textHash = (((textHash - textArray[i] * pown) << 1) + textArray[i + m]) % prime;
                if (textHash < 0) {
                    textHash += prime;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "orewa mugiwara no luffy ";
        String pattern = "luffy";
        int index = search(text, pattern);
        if (index != -1) {
            System.out.println("Pattern found at index: " + index);
        } else {
            System.out.println("Pattern not found.");
        }
    }

}
