/* Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

Input Format

Input Consists of two integer.
First one is for width and second one is for height.
Constraints

Both value should be lesser than equals to 10

Output Format

Execute the values of both are and perimeter of the rectangle.

Sample Input 0

5
4
Sample Output 0

Here your Answers!!!
Area of the Rectangle is 20.00
Perimeter of the Rectangle is 18.00
Sample Input 1

12
4
Sample Output 1

Hello User,Kindly Enter the valid Input.
 */

//Code
package Oops;
import java.util.*;

class RectangleShape {
    double width, height;

    RectangleShape(double a, double b) {
        this.width = a;
        this.height = b;
    }

    double area() {
        return width * height;
    }

    double perimeter() {
        return 2 * (width + height);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 10 && b <= 10) {
            RectangleShape rect = new RectangleShape(a, b);

            System.out.println("Here your Answers!!!");
            System.out.printf("Area of the Rectangle is %.2f%n", rect.area());
            System.out.printf("Perimeter of the Rectangle is %.2f%n", rect.perimeter());
        } else {
            System.out.println("Hello User,Kindly Enter the valid Input.");
        }

        sc.close();
    }
}