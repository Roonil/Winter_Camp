package assign2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        do {
            s = sc.next();
            if (s.equals("done"))
                break;
            if (s.charAt(0) == s.charAt(s.length() - 1))
                System.out.println(true);
            else
                System.out.println(false);

        } while (s.equals("done") == false);
        sc.close();
    }
}
