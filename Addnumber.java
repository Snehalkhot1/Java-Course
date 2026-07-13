// Addition of Two Numbers

import java.lang.*;
import java.util.*;
class Addnumber {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Element :");
        int a = sc.nextInt();

        System.out.println("Enter Second Element :");
        int b = sc.nextInt();

        int c = a + b;
        System.out.println("The Sum of a+b :" + c);

        sc.close();

    }
}
