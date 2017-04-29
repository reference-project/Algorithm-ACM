//有理数的类封装
public class Rational {
    public int numerator;
    public int denominator;
    Rational(){}
    Rational(int a, int b){
        if(b==0){
            System.out.println("分母不能为0");
            return ;
        }
        numerator=a;
        denominator=b;
        simplifying();
    }
    //化简约分
    void simplifying(){
        int c=gcd(numerator,denominator);
        numerator/=c;
        denominator/=c;
    }
    //求最大公约数
    int gcd(int a,int b){
        if(a<b){
            int c=a;
            a=b;
            b=c;
        }
        int r=a%b;
        while(r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
    //加法
    public Rational add(Rational b){
        return new Rational(numerator*b.denominator+b.numerator*denominator,denominator*b.denominator);
    }
    //减法
    public Rational sub(Rational b){
        return new Rational(numerator*b.denominator-b.numerator*denominator,denominator*b.denominator);
    }
    //乘法
    public Rational multi(Rational b){
        return new Rational(numerator*b.numerator,denominator*b.denominator);
    }
    //除法
    public Rational div(Rational b){
        return new Rational(numerator*b.denominator,denominator*b.numerator);
    }
    public String valueToString(){
        return String.valueOf(numerator)+"/"+String.valueOf(denominator);
    }
}
