import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class assignment5 {
    public static void main(String[] args) {
        // Q1 test
        String Q1Test = "leetcode";
        System.out.println("Q1 result:" + findFirstIndex(Q1Test));
        System.out.println();

        // Q2 test
        int Q2Test = 38;
        System.out.println("Q2 result:" + addAllDigit(Q2Test));
        System.out.println();

        // Q3 test
        int[] Q3temp = {0, 1, 0, 3, 12};
        int[] result = moveAllZero(Q3temp);
        System.out.println("Q3 Result");
        for (int i : result) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println();
        // Q4 test
        String Q4Test = "babad";
        System.out.println("Q4 Result: " + longestPalindrome(Q4Test));
        System.out.println();


        // Q5 test
        System.out.println("Q5 Result");
        int[][] Q5test = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(Q5test);
        for(int[] temp : Q5test) {
            for (int i : temp) {
                System.out.print(i + ",");
            }
            System.out.println();
        }

    }

    // Q1
    public static int findFirstIndex(String s) {
        char[] array = s.toCharArray();
        int index = -1;
        label:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    continue label;
                }
            }
            index = i;
            break;
        }
        return index;
    }

    // Q2
    public static int addAllDigit(int input) {
        int result = input;
        while (result > 10) {
            result = addAllDigitHelper(result);
        }
        return result;
    }

    private static int addAllDigitHelper(int input) {
        int result = 0;
        while (input > 0) {
            result += input % 10;
            input = input / 10;
        }
        return result;
    }

    // Q3
    public static int[] moveAllZero(int[] arr) {
        if (arr == null) {
            return null;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    // Q4
    public static String longestPalindrome(String s) {
        // write your code here
        // from left right, count odd and even strings
        String maxString = "";
        if (s == null || s.length() == 0) {
            return maxString;
        }
        maxString += s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            String a = checkMax(s, i, i);
            String b = checkMax(s, i - 1, i);
            if (a.length() > maxString.length()) {
                maxString = a;
            }
            if (b.length() > maxString.length()) {
                maxString = b;
            }
        }
        return maxString;
    }
    private static String checkMax(String s, int i, int j) {
        // check from center
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
            i--;
            j++;
        }
        return s.substring(++i, j);
    }

    // Q5
    public static void rotate(int[][] matrix) {
        // write your code here
        int n = matrix.length;
        for (int r = 0; r < (n + 1) / 2; r++) {
            for (int c = 0; c < n / 2; c++) {
                int tmp = matrix[r][c];
                matrix[r][c] = matrix[n - 1 - c][r];
                matrix[n - 1 - c][r] = matrix[n - 1 - r][n - 1 - c];
                matrix[n - 1 - r][n - 1 - c] = matrix[c][n - 1 - r];
                matrix[c][n - 1 - r] = tmp;
            }
        }
    }
}
