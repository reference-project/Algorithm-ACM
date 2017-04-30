//约瑟夫环问题
public class JosephCircle {
    public static int josephCirle(int n,int m){
        int s=0;
        for (int i = 2; i <= n;i++){
            s = (s + m) % i;
        }
        return s+1;
    }
}
