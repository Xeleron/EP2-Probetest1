// This class represents a polynomial. A polynomial is a sum of multiple monomials (class 'Monom'),
// such as 3*x^1 + -1*x^2 + 1*x^5.
// 'Polynom' uses a binary search tree to store its monomials. The degree of the monomial is the key.
// A specific degree exists at most once in the polynomial.

public class Polynom {
    private Polynom left;
    private Polynom right;
    private Monom value;

    // Initializes this polynomial with multiple monomials. The coefficients of the monomials are
    // specified by 'coeffs', where coeffs[i] is the coefficient of the monomial of degree i.
    // Entries with value 0 are ignored, i.e. corresponding monomials are not stored in the polynomial.
    public Polynom(int[] coeffs) {
        for (int i = 0; i < coeffs.length; i++) {
            if (coeffs[i] != 0) add(coeffs[i], i);
        }
    }

    private Polynom() {
    }

    // Adds the monomial specified by 'coeff' and 'degree' to this polynomial, if coeff != 0,
    // otherwise 'add' has no effect.
    // If this polynomial already has a monomial of the same degree, no new monomial is added, instead
    // the coefficient of the monomial is modified accordingly ('combine' is called).
    public void add(int coeff, int degree) {
        if (coeff == 0) return;
        var monom = new Monom(coeff, degree);
        if (value == null) {
            value = monom;
            return;
        }
        if (value.combine(monom)) return;
        if (value.lowerDegreeThan(monom)) {
            if (right == null) right = new Polynom();
            right.add(coeff, degree);
        } else {
            if (left == null) left = new Polynom();
            left.add(coeff, degree);
        }
    }

    // Adds all monomials of 'p' to this polynomial.
    // (The rules of 'add(int,int)' apply for each monomial to be added.)
    public void add(Polynom p) {
        if (p.left != null) add(p.left);
        add(p.value.getCoeff(), p.value.getDegree());
        if (p.right != null) add(p.right);
    }

    // Returns the value of the polynomial for a specified value of 'x'
    public int eval(int x) {
        int sum = 0;
        if (left != null) sum += left.eval(x);
        sum += value.eval(x);
        if (right != null) sum += right.eval(x);
        return sum;
    }

    // Returns a polynomial representation in mathematical notation such as
    // "2*x^0 + 6*x^2 + -2*x^3", where monomials are ordered ascending according to
    // their degree. Note that a positive sign of the leftmost coefficient is
    // not shown.
    // Returns the string "0" if the polynomial has no monomials (is empty).
    public String toString() {
        if (value == null) return "0";
        StringBuilder sb = new StringBuilder();
        if (left != null) sb.append(left).append(" + ");
        sb.append(value);
        if (right != null) sb.append(" + ").append(right);
        return sb.toString();
    }
}

