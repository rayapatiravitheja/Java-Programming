/* In a theater, there is a discount scheme announced where one gets a 10% discount on the total cost of tickets when there is a bulk booking of more than 20 tickets, and a discount of 2% on the total cost of tickets if a special coupon card is submitted. Develop a program to find the total cost as per the scheme. The cost of the k class ticket is Rs.75 and q class is Rs.150. Refreshments can also be opted by paying an additional of Rs. 50 per member.

**Hint: **k and q and You have to book minimum of 5 tickets and maximum of 40 at a time. If fails display “Minimum of 5 and Maximum of 40 Tickets”. If circle is given a value other than ‘k’ or ‘q’ the output should be “Invalid Input”.

The ticket cost should be printed exactly to two decimal places.

Input Format

First input consist of no of tickets second input consists of refreshment Third input consist of coupon Forth input consist of ticket type

Constraints

No Constraints

Output Format

Execute the price of the tickects and the statements.

Sample Input 0

15
y
y
k
Sample Output 0

Ticket cost:1852.50
Sample Input 1

45
y
y
k
Sample Output 1

Minimum of 5 and Maximum of 40 tickets
Sample Input 2

12
y
y
b
Sample Output 2

Invalid Input */

//Code

import java.util.*;
public class TheaterDiscount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tickets = sc.nextInt();
            char refreshment = sc.next().charAt(0);
            char coupon = sc.next().charAt(0);
            char type = sc.next().charAt(0);
            
            if (tickets < 5 || tickets > 40) {
                System.out.println("Minimum of 5 and Maximum of 40 tickets");
                return;
            }
            
            if (type != 'k' && type != 'q') {
                System.out.println("Invalid Input");
                return;
            }
            
            double ticketCost;
            if (type == 'k')
                ticketCost = tickets * 75;
            else
                ticketCost = tickets * 150;
                
            if (tickets > 20)
                ticketCost -= ticketCost * 0.10;
            if (coupon == 'y')
                ticketCost -= ticketCost * 0.02;
                
            double totalCost = ticketCost;
            if (refreshment == 'y')
                totalCost += tickets * 50;
                
            System.out.printf("Ticket cost:%.2f\n", totalCost);
        }
    }
}