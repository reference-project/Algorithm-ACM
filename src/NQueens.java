//N 皇后问题,求 N 皇后问题可能分布的总数量
public class NQueens {
    int pn=8;//皇后数量
    int[] b=new int[20];//列方向
    int[] zx=new int[40];//正斜方向
    int[] fx=new int[40];//反斜方向
    int an=0;
    public int dfs(int n)
    {
        if(n==pn)
        {
            an++;
            return 0;
        }
        int i1,i2;
        for(int i=0;i<pn;i++)
        {
            i1=i+n;
            i2=i-n+pn-1;
            if(b[i]!=0||zx[i1]!=0||fx[i2]!=0)
                continue;
            b[i]=1;
            zx[i1]=1;
            fx[i2]=1;
            dfs(n+1);
            b[i]=0;
            zx[i1]=0;
            fx[i2]=0;
        }
        return an;
    }
}
