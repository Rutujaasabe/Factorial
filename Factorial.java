package Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        System.out.println("find out fictorial of ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
