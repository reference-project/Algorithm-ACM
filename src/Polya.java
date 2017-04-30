//Polya定理，c种颜色的珠子，组成长为n的项链，项链没有方向和起始位置。
public class Polya {
    public static int polya(int c,int n){
        int s=0;
        s+=Math.pow(c,n);
        for(int i=1;i<n;i++)s+=Math.pow(c,Gcd.gcd(n,i));
        s/=n;
        return s;
    }
}
