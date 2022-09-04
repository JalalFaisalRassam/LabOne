// Write a program that reads an integer and prints whether it is
// negative, zero, or positive.

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
int x ;
        Scanner test = new Scanner(System.in);
        System.out.println("enter an integer number : ");
        x= test.nextInt();
        if(x>0)
            System.out.println(" positive ");
        else if (x<0)
            System.out.println("negative");
        else System.out.println("zero");
    }
}
