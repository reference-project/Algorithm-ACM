//扩展gcd，求x，y使得 gcd(a,b)=a*x+b*y;
public class Extgcd {
    public static int extgcd(int a,int b,int[] x){
        if(b==0){
            x[0]=1;
            x[1]=0;
            return a;
        }
        int d=extgcd(b,a%b,x);
        int t=x[0];
        x[0]=x[1];
        x[1]=t-a/b*x[1];
        return d;
    }
}
