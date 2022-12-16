package assign1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        Integer[] arr = new Integer[size];
        String[] s = new String[size];
        for (int i = 0; i < size; i++) {
            s[i] = sc.next();
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < size; i++) {
            System.out.printf("%-15s", s[i]);
            // System.out.printf();
        }
    }
}
