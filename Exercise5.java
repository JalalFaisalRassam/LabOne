import java.util.Scanner;

//Write a program that reads three numbers and prints
// “increasing” if they are in increasing order, “decreasing”
// if they are in decreasing order, and “neither” other wise.
// Here, “increasing” means “strictly increasing”, with each value
// larger than its predecessor. The sequence 3 4 4 would not be considered increasing.
public class Exercise5 {
    public static void main(String[] args) {
        int x1,x2,x3;
        Scanner same=new Scanner(System.in);
        System.out.println("enter three numbers : ");
        x1=same.nextInt();
        x2=same.nextInt();
        x3=same.nextInt();
        if (x1<x2&&x2<x3)
            System.out.println("increasing ");
        else if (x1>x2&&x2>x3)System.out.println("decreasing  ");
      else  if (x1==x2&&x2==x3)
            System.out.println("all the same ");
      else System.out.println("some are the same ");
    }
}
