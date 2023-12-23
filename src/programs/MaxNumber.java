package programs;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int result = maxFind(ar);
        System.out.println(result);
    }

    private static int maxFind(int[] a) {
        int max = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;

        /////////////
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] ar = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            ar[i] = sc.nextInt();
//        }
//        int ans = ar[0];
//        for (int i = 1; i < n; i++) {
//            ans = Math.max(ans, ar[i]);
//        }
//        System.out.println(ans);

    }
}
