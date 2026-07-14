// Area of the Circle

import java.lang.*;
import java.util.*;
class Circlearea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of the radius to area of the circle :");
        float r = sc.nextInt();
        
        double area = 3.14*r*r;
        System.out.println("The area of the Circle is :" +area);
        
    }
}