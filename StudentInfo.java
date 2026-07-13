//  Print student information (name,age,city) by usind scanner methode

import java.lang.*;
import java.util.*;
class StudentInfo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String name;
        // int age;
        // char city;

        System.out.println("Enter your Name :" );
        String name = sc.nextLine();

        System.out.println("Enter your Age :");
        int age = sc.nextInt();

        System.out.println("Enter your City :" );
        String city = sc.next();

        sc.close();
    }
}