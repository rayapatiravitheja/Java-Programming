/* Chain Marketing Organization has has a scheme for income generation, through which its members generate income for themselves. The scheme is such that suppose A joins the scheme and makes R and V to join this scheme then A is Parent Member of R and V who are child Members. When any member joins the scheme then the parent gets total commission of 10% from each of its child members. Child members receive commission of 5% respectively. If a Parent member does not have any member joined under him, then he gets commission of 5%. Take name of the members joining the scheme as input. Display how many members joined the scheme including parent member.Calculate the Total commission gained by each members in the scheme. The fixed amount for joining the scheme is Rs.5000 on which commission will be generated SchemeAmount = 5000

Example 1: When there are more than one child members

Input : (Do not give input prompts.Accept values as follows. )

 Amit    //Enter parent Member as this
 Y       //Enter Y if  Parent member has child members otherwise enter N
 Rajesh,Virat        //Enter names of child members of Amit in comma separated
Output:(Final Output must be in format given below.)

 TOTAL MEMBERS:3
 COMISSION DETAILS
 Amit: 1000 INR
 Rajesh :250 INR
 Virat: 250 INR
Example 2: When there is only one child member in the hierarchy Input :

  Amit
  Y
  Rajesh
Output:

  Total Members: 2 
  Comission Details
  Amit: 500 INR
  Rajesh: 250 INR
Input Format

Input corresponds to the parents name
Input corresponds to the child members(Y or N)
Input corresponds to the child name separated by comma.
Constraints

No Constraints

Output Format

Execute the given format output.

Sample Input 0

Amit
Y
Rajesh,Virat
Sample Output 0

TOTAL MEMBERS:3
COMISSION DETAILS
Amit: 1000 INR
Rajesh: 250 INR
Virat: 250 INR
Sample Input 1

Amit
N
Sample Output 1

Total Members: 1 
Comission Details
Amit: 250 INR */

//Code

import java.util.Scanner;

public class ChainMarketingOrganization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// Read parent name and whether they have children
        String parentName = scanner.nextLine().trim();
        String hasChildren = scanner.nextLine().trim();

        double schemeAmount = 5000.0;

        if (hasChildren.equalsIgnoreCase("Y")) {
            String childrenInput = scanner.nextLine().trim();
            String[] childrenList = childrenInput.split(",");

            int totalMembers = 1 + childrenList.length;
            // Parent gets 10% commission from each child
            int parentCommission = (int) (0.10 * schemeAmount * childrenList.length);
            // Each child gets 5% commission
            int childCommission = (int) (0.05 * schemeAmount);

            // Print output matching the exact case requirement for multiple members
            System.out.println("TOTAL MEMBERS:" + totalMembers);
            System.out.println("COMISSION DETAILS");
            System.out.println(parentName + ": " + parentCommission + " INR");
            
            for (String child : childrenList) {
                System.out.println(child.trim() + ": " + childCommission + " INR");
            }

        } else {
            // Parent has no children, gets 5% commission
            int parentCommission = (int) (0.05 * schemeAmount);

            // Print output matching the exact case requirement for a single member
            System.out.println("Total Members: 1 ");
            System.out.println("Comission Details");
            System.out.println(parentName + ": " + parentCommission + " INR");
        }

        scanner.close();
    }
}
