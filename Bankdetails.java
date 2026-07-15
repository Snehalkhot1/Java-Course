// Bank Account Details 

import java.lang.*;
import java.util.*;
class Bankdetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Account Holder Name :");
        String holder = sc.nextLine();
        System.out.println("Enter the Account Number :");
        double Number = sc.nextInt();
        System.out.println("Enter the Bank Name :");
        String name = sc.next();
        System.out.println("Enter the Bank balance :");
        double balance = sc.nextDouble();

        sc.close();


    }
}