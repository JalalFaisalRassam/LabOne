import java.util.Scanner;

//Write a program that reads in three integers and prints
// “in order” if they are sorted in ascending or descending
// order, or “not in order” otherwise. For example,
// 1 2 5 in order
// 1 5 2 not in order
// 5 2 1 in order
// 1 2 2 in order
public class Exercise6 {
    public static void main(String[] args) {
        int x1,x2,x3;
        Scanner same=new Scanner(System.in);
        System.out.println("enter three numbers : ");
        x1=same.nextInt();
        x2=same.nextInt();
        x3=same.nextInt();
        if (x1<x2&&x2<=x3)
            System.out.println("in order ");
       else if (x1<=x2&&x2<x3)
            System.out.println("in order ");
        else if (x1>=x2&&x2>x3)
            System.out.println("in order  ");
        else  if (x1==x2&&x2==x3)
            System.out.println("all the same ");
       // else System.out.println("some are the same ");
    }

}
