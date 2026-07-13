// Average of three Numbers

import java.lang.*;
import java.util.*;
class Average3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println("Enter Thrid Number :");
        int c = sc.nextInt();

        int d= (a+b+c)/3;
        System.out.println(d);

        sc.close();

    }
}