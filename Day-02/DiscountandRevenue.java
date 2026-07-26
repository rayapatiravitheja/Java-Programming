/* Revenue can be calculated as the selling price of the product times the quantity sold,

i.e. revenue = price × quantity. 
Write a program that asks the user to enter product price and quantity and then calculate the revenue. If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue.

Input Format

First input consists of price Second input consists of quantity

Constraints

No Constraints

Output Format

Display the value of Discount and revenue

Sample Input 0

2000
45
Sample Output 0

The discount is Rs.9000.00
The net revenue is Rs.81000.00
Sample Input 1

3000
2
Sample Output 1

The discount is Rs.600.00
The net revenue is Rs.5400.00
Sample Input 2

1500
2
Sample Output 2

The discount is Rs.0
The net revenue is Rs.3000.00 */

//code

import java.util.*;

public class DiscountandRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        
        double revenue = price * quantity;
        double discount = 0;
        double netRevenue = revenue;
        
        if (revenue > 5000) {
            discount = revenue * 0.10;
            netRevenue = revenue - discount;
        }
        
        System.out.printf("The discount is Rs.%.2f\n", discount);
        System.out.printf("The net revenue is Rs.%.2f\n", netRevenue);
        
        sc.close();
    }
}