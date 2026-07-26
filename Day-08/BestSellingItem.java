/* You are provided with a list of sales entries, each entry containing three fields: the name of the item, the price per unit, and the number of units sold. An item can appear multiple times in the list with different units sold each time. Your task is to compute the total sales, the average sales per entry, and identify the best-selling item based on total revenue generated from that item.

Input:

[ (“Tomato”, 2.0, 3),(“Potato”, 1.5, 10), (“Tomato”, 2.0, 2),(“Carrot”, 1.0, 8),(“Potato”, 1.5, 5)]
Output:

Total Sales: $47.50

Average Sales: $9.50

Best Selling Item: Potato
Explanation:

The total sales are calculated as follows: (2.0×3)+(1.5×10)+(2.0×2)+(1.0×8)+ (1.5×5)=6+15+4+8+7.5-40.5.

(2.0×3)+(1.5×10)+(2.0×2)+(1.0×8)+(1.5×5)=6+15+4+8+7.5-40.5

Average sales per entry: 40.5/5-9.5. 40.5/5-9.5

Best selling item: “Potato” generates the most sales (1.5 each

Input Format

You will be given a list of tuples, each tuple containing a string and two floats. The string represents the item name, the first float represents the price per unit, and the second float represents the number of units sold.

Constraints

The list will have at least one entry. The price per unit will be a positive decimal number. The units sold will be a non-negative integer

Output Format

Print the total sales rounded to two decimal places. Print the average sales per entry rounded to two decimal places. Print the name of the best-selling item based on the total sales.

Sample Input 0

5
Tomato 2.0 3
Potato 1.5 10
Tomato 2.0 2 
Carrot 1.0 8
Potato 1.5 5
Sample Output 0

Total Sales: $40.50
Average Sales: $8.10
Best Selling Item: Potato */

//Code

import java.util.*;
public class BestSellingItem {
      public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float total = 0;
        float max = 0;
        String best="";
        for (int i=0;i<n;i++){
            String str = sc.next();
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float mul = a*b;
            
            if(mul>max){
                max =mul;
                best=str;
            }
            total+=mul;
        }
        float avg = total/n;
        System.out.printf("Total Sales: $%.2f",total);
        System.out.printf("\nAverage Sales: $%.2f",avg);
        System.out.printf("\nBest Selling Item: "+best);
        sc.close();
        
    }
}
