/* Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

      Formula:  Area of the Circle is πr^2
                 circumference of the circle 2πr
Input Format

Input Consists of integer.

Constraints

Input value should be lesser than or equals to 10

Output Format

Execute the values of both area and circumference of the circle.

Sample Input 0

4
Sample Output 0

Hello User,Here your Answer!!!!
Area of the Circle is 50.26548
Circumference of the Circle is 25.13274
Sample Input 1

67
Sample Output 1

Hello User,Kindly Enter the valid Input... */
//Code

import java.util.Scanner;
package Oops;
class CircleShape {
    private double radius;

    CircleShape(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();

        if (radius <= 10) {
            CircleShape circle = new CircleShape(radius);

            System.out.println("Hello User,Here your Answer!!!!");
            System.out.printf("Area of the Circle is %.5f%n", circle.area());
            System.out.printf("Circumference of the Circle is %.5f%n", circle.circumference());
        } else {
            System.out.println("Hello User,Kindly Enter the valid Input...");
        }

        sc.close();
    }
}