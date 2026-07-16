import java.lang.*;
import java.util.*;
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4-digit number: ");
        int num = sc.nextInt();
        int d1 = num% 10;
        int d2 = (num / 10) % 10;
        int d3 = (num / 100) % 10;
        int d4 =num/1000;

        int reverse = d1*1000 + d2*100 + d3*10 + d4*1;
        System.out.println("Reversed number = " +reverse);

        sc.close();
    }
    
}