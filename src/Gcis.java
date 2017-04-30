//最长公共子序列-动态规划实现
public class Gcis {
    public static int gcis(int[] a,int[] b ){
        int an=a.length;
        int bn=b.length;
        int[][] dp=new int[an+1][bn+1];
        for(int i=0;i<=an;i++){
            dp[i][bn]=0;
        }
        for(int i=0;i<=bn;i++){
            dp[an][i]=0;
        }
        for(int i=an-1;i>=0;i--){
            for(int j=bn-1;j>=0;j--){
                if(a[i]==b[j]){
                    dp[i][j]=dp[i+1][j+1]+1;
                }else{
                    if(dp[i][j+1]>dp[i+1][j])
                        dp[i][j]=dp[i][j+1];
                    else
                        dp[i][j]=dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
}
