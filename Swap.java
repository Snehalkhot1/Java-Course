// Swap two number

 import java.lang.*;
 import java.util.*;
 class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Swapping :");
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        int temp =a;
        a =b;
        b=temp;
        System.out.println("After Swapping ");
        System.out.println("The value of a is :" +a);
        System.out.println("The value of b is :" +b);

        sc.close();
    }
 }