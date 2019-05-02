// This class can be modified and is for testing your solution.
// Modifications will NOT be reviewed or assessed.
public class PraxisApplication {

    public static void main(String[] args) {

        Monom m = new Monom(3,2);
        System.out.println(m); // 3*x^2
        System.out.println(m.eval(-5)); // 75
        System.out.println(m.eval(0)); // 0

        System.out.println(m.combine(new Monom(-1,2))); // true
        System.out.println(m); // 2*x^2

        System.out.println(m.combine(new Monom(-1,3))); // false
        System.out.println(m); // 2*x^2

        Polynom p1 = new Polynom(new int[] {2,0,3,1});
        Polynom p2 = new Polynom(new int[] {0,0,3,-1});

        System.out.println(p1); // 2*x^0 + 3*x^2 + 1*x^3
        System.out.println(p1.eval(-5)); // -48
        System.out.println(p2); // 3*x^2 + -1*x^3

        p1.add(p2);

        System.out.println(p1); // 2*x^0 + 6*x^2 + 0*x^3


        p1 = new Polynom(new int[] {2,0,3,1});
        p2 = new Polynom(new int[] {0,0,3,1});

        p2.add(p1);

        System.out.println(p2); // 2*x^0 + 6*x^2 + 2*x^3

    }
}
