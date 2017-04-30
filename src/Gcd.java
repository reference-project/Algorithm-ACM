//最大公约数
public class Gcd {
    public static int gcd(int a,int b){
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
}
