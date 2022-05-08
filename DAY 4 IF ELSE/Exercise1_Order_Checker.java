/*Exercise 1 — Order Checker
Bob's Discount Bolts charges the following prices:
• 5 cents per bolt
• 3 cents per nut
• 1 cent per washer
Write a program that asks the user for the number of bolts, nuts, and washers
 in their purchase
and then calculates and prints out the total.
 As an added feature, the program checks the order.
  A
correct order must have at least as many nuts as bolts and at least twice as many washers as blots,
otherwise the order has an error.
For an error the program writes out "Check the Order: too few nuts" or "Check the Order: too
few washers" as appropriate. Both error messages are written if the order has both errors. If there
are no errors the program writes out "Order is OK." In all cases the total price in cents (of the
specified number of items) is written out.
Number of bolts: 12
Number of nuts: 8
Number of washers: 24
Check the Order: too few nuts
Total cost: 108
Use constants for the uit cost of each item. In other words, declare constants such as final int
boltPrice = 5;. */

import java.util.*;
class Exercise1_Order_Checker
{
public static void main(String[] args)


{

Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of bolts");
int a=sc.nextInt();
System.out.println("Enter no. of nuts");
int b=sc.nextInt();
System.out.println("Enter no. of washers");
int c=sc.nextInt();
int total=0;
total=a+b+c;
{
System.out.println(total);
}
if(a==b || 2*c==b)
{
 System.out.println("order is ok");

}
else
{
System.out.println("Check the Order: too few nuts or Check the Order: too few washers");

}
}
}