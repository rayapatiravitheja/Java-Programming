/* Veena wants to learn shape calculation for Square,Rectangle,Circle,Triangle to implements in programming.Could you please help her to how to write the program. Notes: - Square formula:4a - Rectangle formula:2(l+w) - Circle formula:2πr - Triangle formula:side+base+side

Input Format

First input consist of integer for side.
Second and third input consists of integer for Length and Width.
forth input consist of radius.
Fifth,Sixth and Seventh input consist of Base1,side and Base2 .
Constraints

No Constraints

Output Format

Execute the area of shape calculation values.
Sample Input 0

9
8
7
6
5
4
3
Sample Output 0

Perimeter of Square:36
Perimeter of Rectangle:30
Perimeter of Circle:37.69
Perimeter of Triangle:12 */

//Code

import java.util.*;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();
        int length = sc.nextInt();
        int width = sc.nextInt();
        int radius = sc.nextInt();
        int base1 = sc.nextInt();
        int side2 = sc.nextInt();
        int base2 = sc.nextInt();

        int squarePerimeter = 4 * side;
        int rectanglePerimeter = 2 * (length + width);
        double circlePerimeter = 2 * Math.PI * radius;
        circlePerimeter = Math.floor(circlePerimeter*100) / 100.0;
        int trianglePerimeter = base1 + side2 + base2;

        System.out.println("Perimeter of Square:" + squarePerimeter);
        System.out.println("Perimeter of Rectangle:" + rectanglePerimeter);
        System.out.printf("Perimeter of Circle:%.2f%n", circlePerimeter);
        System.out.println("Perimeter of Triangle:" + trianglePerimeter);

        sc.close();
    }
}
