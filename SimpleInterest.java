// calculate the Simple Interest

import java.lang.*;
import java.util.*;
class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount :");
        int p=sc.nextInt();
        System.out.println("Enter the rate of amount :");
        int r = sc.nextInt();
        System.out.println("Enter the Time taken :");
        int t = sc.nextInt();

        double SI = (p*r*t)/100;
        System.out.println("The Simple Interest is :" +SI);

        sc.close();
    }
}