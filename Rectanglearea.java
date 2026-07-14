//Area of the Rectangle 

import java.lang.*;
import java.util.*;
class Rectanglearea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the length :");
        int l = sc.nextInt();
        System.out.println("Enter the breadth :");
        int b = sc.nextInt();

        double area = l*b;
        System.out.println("The area of the rectangle :" +area);

        sc.close();


    }
}