import java.lang.*;
import java.util.*;
class Meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance that you have travelled in kilometer :");
        int distance = sc.nextInt();

        int Meter = distance*100;
        System.out.println("The Distance you have travelled in Meter is :" + Meter);

        int cm = distance*100000;
        System.out.println("The distance you have travelled in centimeter is :" + cm);

        int mm = distance * 1000000;
        System.out.println("The distance you have travelled in millimeter is :" + mm);

        sc.close();

    }
}