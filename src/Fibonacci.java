//矩阵快速幂求斐波那契数列第n项，时间复杂度O(logn)。
public class Fibonacci {
    public int fibonaci(int n){
        if(n<3)return 1;
        int[][] r={{1,0},{0,1}};
        int[][] base={{1,1},{1,0}};
        int b=n-1;
        while(b!=0){
            if((b&1)==1)
                multi(r,base);
            multi(base,base);
            b>>=1;
        }
        return r[0][0];
    }
    void multi(int[][] a,int[][] b){
        int[][] c=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                int s=0;
                for(int k=0;k<2;k++)
                    s+=a[i][k]*b[k][j];
                c[i][j]=s;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                a[i][j]=c[i][j];
        }
    }
}
