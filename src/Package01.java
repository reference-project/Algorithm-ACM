//01背包问题
public class Package01 {
    //w重量，v容量,n个数，c背包容量
    public int package01(int[] w,int[] v,int n,int c){
        int[][] m=new int[n+1][c+1];
        int j;
        for(j=0;j<w[n-1]&&j<=c;j++)m[n][j]=0;
        for(;j<=c;j++)m[n][j]=v[n];
        for(int i=n-1;i>0;i--){
            for(j=0;j<w[i];j++)m[i][j]=m[i+1][j];
            for(j=w[i];j<=c;j++){
                m[i][j]=Math.max(m[i+1][j],m[i+1][j-w[i]]+v[i]);
            }
        }
        return m[1][c];
    }
}
