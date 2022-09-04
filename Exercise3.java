// Write a program that reads an integer and prints
// how many digits the number has, by checking whether
// the number is ≥ 10, ≥ 100, and so on.
// (Assume that all integers are less than ten billion.)
// If the number is negative, first multiply it with –1.

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int x;
        Scanner digit=new Scanner(System.in);
        System.out.println("enter a number to count its digits : ");
        x= digit.nextInt();
        if(x>-1&&x<10)
            System.out.println("the digits are one : ");
       else if(x>9&&x<100)
            System.out.println("the digits are two : ");
       else if(x>99&&x<1000)
            System.out.println("the digits are three : ");
       else if(x>999&&x<10000)
            System.out.println("the digits are four: ");
     else  if(x>9999&&x<100000)
            System.out.println("the digits are five : ");

    }

}
