public class Exercise1 {
    public static void main(String[] args) {
     //   1. What do these code fragments print?
      //  a.
        System.out.println("aaaaaaaaaaaaaaaaaaa");
        int n = 1;
        int m = -1;
        if (n < -m)
        { System.out.print(n); }
        else { System.out.print(m); }   // -1 is  printed
        System.out.println("\n bbbbbbbbbbbbbbbbbbbb");
        // b.
        int n1 = 1;
        int m2 = -1;
        if (-n1 >= m2)
        { System.out.print(n1); }   //  1  is printed
        else { System.out.print(m2); }
        System.out.println("\n cccccccccccccccccccc");
 //       c.
        double x = 0;
        double y = 1;
        if (Math.abs(x - y) < 1)
        { System.out.print(x); }
        else { System.out.print(y); }  // 1.0  is printed
        System.out.println("\n dddddddddddddddddddddd");
        //d.
        double x1 = Math.sqrt(2);
        double y1 = 2;
        if (x1 * x1 == y1)
        { System.out.print(x1); }
        else { System.out.print(y1);     // 2.0  is printed
    }}}
