package assign1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int i;
        double d;
        String s;
        Scanner sc = new Scanner(System.in);

        i = sc.nextInt();
        d = sc.nextDouble();
        s = sc.nextLine();
        s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        sc.close();
    }
}
