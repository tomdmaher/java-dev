public class PrintSquares {
    // compute x^2
    public static int sq(int x) {
        // x is a parameter variable
        int y = x * x; // compute the value
        return y; // return the value
    }
    public static void main(String[] args) {
        System.out.println(7 + "^2=" + sq(7));
        System.out.println(9 + "^2=" + sq(9));
    }
}
