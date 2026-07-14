// fareneit Conversion

import java.lang.*;
import java.util.*;
class fareneitconvert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of the temperature in celcius :");
        int temp = sc.nextInt();

        double F = 1.8*temp+32;
        System.out.println("The Conversion of temperature in degree celcius to the Fareneit is :" + F);

    }
}