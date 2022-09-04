// Write a program that reads three numbers and prints
// “all the same” if they are all the same,
// “all different” if they are all different, and “neither” otherwise

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int x1,x2,x3;
        Scanner same=new Scanner(System.in);
        System.out.println("enter three numbers : ");
        x1=same.nextInt();
        x2=same.nextInt();
        x3=same.nextInt();
        if (x1==x2&&x2==x3)
            System.out.println("all the same ");
        else System.out.println("all different ");


    }
}
