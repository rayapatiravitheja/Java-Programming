/* Veena wants to learn shape calculation for Square,Rectangle,Circle,Triangle to implements in programming.Could you please help her to how to write the program. - Square formula:a*a - Rectangle formula:l*b - Circle formula:πr^2 - Triangle formula:1/2*(b*h)

Input Format

First input consist of integer for side.
Second and third input consists of integer for Length and breadth.
forth input consist of radius.
Fifth and Sixth input consist of Base and height.
Constraints

No Constraints

Output Format

Execute the area of shape calculation values.
Sample Input 0

2
3
2
3
6
5
Sample Output 0

Area of Square=4
Area of Rectangle=6
Area of Circle=28.27
Area of Triangle=15
Sample Input 1

2
3
4
5
6
7
Sample Output 1

Area of Square=4
Area of Rectangle=12
Area of Circle=78.53
Area of Triangle=21 */

//Code

import java.util.*;

public class Q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int side = sc.nextInt();
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int radius = sc.nextInt();
        int base = sc.nextInt();
        int height = sc.nextInt();

        int square = side * side;
        int rectangle = length * breadth;
        double circle = Math.PI * radius * radius;
        circle = Math.floor(circle*100) / 100.0;
        int triangle = (base * height) / 2;

        System.out.println("Area of Square=" + square);
        System.out.println("Area of Rectangle=" + rectangle);
        System.out.printf("Area of Circle=%.2f\n", circle);
        System.out.println("Area of Triangle=" + triangle);
        sc.close();
    }
}
