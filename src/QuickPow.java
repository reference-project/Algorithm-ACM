//快速幂，位运算
public class QuickPow {
    public int quickPow(int a,int b){
        int r=1,base=a;
        while(b){
            if((b&1)==1)
                r*=base;
            base*=base;
            b>>=1;
        }
        return r;
    }
}
