// This class represents monoms of the form a*x^d ("a mal x hoch d"), where
// 'a' is the coefficient of the monom and 'd' is the degree.
public class Monom {

    //TODO: declare variables

    // A constructor with the coefficient 'coeff' and the 'degree' of this monom.
    public Monom(int coeff, int degree) {
        // TODO: implement this constructor
    }

    // Copy-constructor: uses 'coeff' and 'degree' of 'm' to initialize this monom.
    public Monom(Monom m) {
        // TODO: implement this constructor
    }

    // Adds the monom 'm' to this monom, if both monoms have the same degree.
    // In this case this monom's coefficient is replaced by the sum of this monom's
    // coefficient and the coefficient of 'm'. In this case the method returns 'true'.
    // If 'm' has not the same degree as 'this', the method has no effect and
    // returns 'false'.
    public boolean combine(Monom m) {
        // TODO: implement this method
        return false;
    }

    // Returns 'true' if 'm' has a higher degree than 'this', and 'false' otherwise.
    public boolean lowerDegreeThan(Monom m) {
        // TODO: implement this method
        return false;
    }

    // Returns the value of the monom for a specified value of 'x'
    public int eval(int x) {
        // TODO: implement this method
        return 0;
    }


    // Returns a representation in mathematical notation, e.g. of the form "5*x^2".
    public String toString() {
        // TODO: implement this method
        return "";
    }


}




