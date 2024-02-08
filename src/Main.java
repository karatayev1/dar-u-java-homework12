import java.util.Scanner;

// Homework 12
public class Main {
    public static void main(String[] args) {
        //Task 2
        System.out.println("......");
        System.out.println(arithmeticOperations(11, 5, '+'));
        System.out.println(arithmeticOperations(11, 5, '-'));
        System.out.println(arithmeticOperations(11, 5, '*'));
        System.out.println(arithmeticOperations(11, 5, '/'));
        System.out.println(arithmeticOperations(11, 5, '%'));

        //Task 3
        System.out.println("......");
        printOddNumbers(1, 20);

        //Task 4
        System.out.println("......");
        int a = 1;
        int b = 6;
        toSwap(a, b);

        //Task 5
        System.out.println("......");
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.println("Введите числа:");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println("Максимальное число: " + findMaxNumber(x, y, z));

        //Task 6
        System.out.println("......");
        System.out.println(defineNumber(0));

        //Task 7
        System.out.println("......");
        String s = "abc";
        replaceChar(s);

        //Task 8
        System.out.println("......");
        int[] array = {3, 5, 7, 12};
        System.out.println(sumArray(array));

        //Task 9
        System.out.println("......");
        int[] arr = {8, 9, 4, 6, 5};
        System.out.println(findSecondMax(arr));

        //Task 10
        System.out.println("......");
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
        System.out.println(restoreString("abc", new int[]{0, 1, 2}));

        //Task 11
        System.out.println("......");
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));

        //Task 12
        System.out.println("......");
        System.out.println(14);
        System.out.println(8);
        System.out.println(123);

        //Task 13
        System.out.println("......");
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String[] word3 = {"a", "cb"};
        String[] word4 = {"ab", "c"};
        String[] word5 = {"abc", "d", "defg"};
        String[] word6 = {"abcddefg"};
        System.out.println(arrayStringAreEqual(word1, word2));
        System.out.println(arrayStringAreEqual(word3, word4));
        System.out.println(arrayStringAreEqual(word5, word6));

        //Task 14
        System.out.println("......");
        int[] arr1 = {1, 4, 2, 5, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {10, 11, 12};
        System.out.println(sumOddLengthSubarrays(arr1));
        System.out.println(sumOddLengthSubarrays(arr2));
        System.out.println(sumOddLengthSubarrays(arr3));
    }

    static double arithmeticOperations(double a, double b, char c) {
        double ret;

        switch (c) {
            case '+':
                ret = a + b;
                break;
            case '-':
                ret = a - b;
                break;
            case '*':
                ret = a * b;
                break;
            case '/':
                ret = a / b;
                break;
            case '%':
                ret = a % b;
                break;
            default:
                ret = 0;
        }
        return ret;
    }

    static void printOddNumbers(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    static void toSwap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "; b = " + b);
    }

    static int findMaxNumber(int x, int y, int z) {
        int max;
        if (x > y) {
            return x > z ? x : z;
        } else {
            return y > z ? y : z;
        }
    }

    static String defineNumber(int a) {
        if (a < 0) {
            return "Число отрицательное";
        } else if (a > 0) {
            return "Число положительное";
        } else {
            return "Число равное 0";
        }
    }

    static void replaceChar(String str) {
        System.out.println(str.replace('a', 'b'));
    }

    static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int findSecondMax(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    static String restoreString(String s, int[] indices) {
        char[] resultArray = new char[s.length()];
        char[] charInWords = s.toCharArray();
        for (int i = 0; i < charInWords.length; i++) {
            resultArray[indices[i]] = charInWords[i];
        }
        return new String(resultArray);
    }

    static boolean isPalindrome(int x) {
        int rev = 0;
        int y = x;

        if (x < 0) {
            return false;
        }

        while (y > 0) {
            rev = rev * 10 + y % 10;
            y /= 10;
        }
        return rev == x;
    }

    static int numberOfSteps(int num) {
        int count = 0;
        if (num == 0) {
            return 0;
        }
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
                count++;
            }
        }
        return count;
    }

    static boolean arrayStringAreEqual(String[] word1, String[] word2) {
        String s1 = makeString(word1);
        String s2 = makeString(word2);

        return s1.equals(s2);
    }

    static String makeString(String[] word) {
        StringBuilder sb = new StringBuilder();

        for (String s : word) {
            sb.append(s);
        }
        return sb.toString();
    }

    static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; ++i) {
            int s = 0;
            for (int j = i; j < n; ++j) {
                s += arr[j];
                if ((j - i + 1) % 2 == 1) {
                    ans += s;
                }
            }
        }
        return ans;
    }
}