public class Main {
    public static void main(String[] args) {
        Rational a=new Rational(4,6);
        Rational b=new Rational(1,3);
        Rational c=a.sub(b);
        System.out.println(c.valueToString());
    }
}