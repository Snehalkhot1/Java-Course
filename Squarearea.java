//Area of the Square

import java.lang.*;
import java.util.*;
class Squarearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the Square to Calculate the area :");
        int side = sc.nextInt();

        int area =side * side;
        System.out.println("Area of the Square is :" +area);
    }
}