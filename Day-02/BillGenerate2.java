/* ohra went to a movie with his friends in a Wave theatre and during break time he bought pizzas, puffs and cool drinks. Consider the following prices :

Rs.100/pizza Rs.20/puffs Rs.10/cooldrink Generate a bill for What Vohra has bought.

Input Format

Sample Input 1:

Enter the no of pizzas bought:10

Enter the no of puffs bought:12

Enter the no of cool drinks bought:5

Constraints

Constraints: No Constraints

Output Format

Sample Output 1:

Bill Details

No of pizzas:10

No of puffs:12

No of cooldrinks:5

Total price=1290

Sample Input 0

12
7
3
Sample Output 0

Bill Details
No of pizzas:12
No of puffs:7
No of cooldrinks:3
Total price=1370
ENJOY THE SHOW!!!
Sample Input 1

11
12
19
Sample Output 1

Bill Details
No of pizzas:11
No of puffs:12
No of cooldrinks:19
Total price=1530
ENJOY THE SHOW!!! */

//Code

import java.util.*;

public class BillGenerate2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pizzas = sc.nextInt();
        int puffs = sc.nextInt();
        int coolDrinks = sc.nextInt();

        int totalPrice = (pizzas * 100) + (puffs * 20) + (coolDrinks * 10);

        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + pizzas);
        System.out.println("No of puffs:" + puffs);
        System.out.println("No of cooldrinks:" + coolDrinks);
        System.out.println("Total price=" + totalPrice);
        System.out.println("ENJOY THE SHOW!!!");

        sc.close();
    }
}
