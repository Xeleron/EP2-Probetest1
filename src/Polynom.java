// A polynom is a sum of multiple monoms, such as 3*x^1 + -1*x^2 + 1*x^5.
// Polynom uses a binary search tree to store its monoms. The degree of the monom is the key.
// A specific degree exists at most once in the polynom.
// TODO: define further classes for the implementation of the binary search tree, if needed

public class Polynom {

    //TODO: declare variables

    // Initializes this polynom with multiple monoms. The coefficients of the monoms are
    // specified by 'coeffs', where coeffs[i] is the coefficient of the monom of degree i.
    // Entries with value 0 are ignored, i.e. corresponding monoms are not stored in the polynom.
    public Polynom(int[] coeffs) {
        // TODO: implement this constructor
    }

    // Adds the monom specified by 'coeff' and 'degree' to this polynom, if coeff != 0,
    // otherwise 'add' has no effect.
    // If the polynom already has a monom of the same degree, no new monom is added, instead
    // the coefficient of the monom is modified accordingly.
    public void add(int coeff, int degree) {
        // TODO: implement this method
    }

    // Adds all monoms of 'p' to this polynom.
    // (The rules of 'add(int,int)' apply for each monom to be added.)
    public void add(Polynom p) {
        // TODO: implement this method
    }

    // Returns the value of the polynom for a specified value of 'x'
    public int eval(int x) {
        // TODO: implement this method
        return 0;
    }

    // Returns a polynom representation in mathematical notation such as
    // "2*x^0 + 6*x^2 + -2*x^3", where monoms are ordered ascending according to
    // their degree. Note that a positive sign of the leftmost coefficient is
    // not shown.
    // Returns the string "0" if the polynom has no monoms (is empty).
    public String toString() {
        // TODO: implement this method
        return "";
    }

}

