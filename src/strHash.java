//字符串哈希算法
public class strHash {
    public int hash(String str,int mod){
        char[] cstr=str.toCharArray();
        int n=cstr.length;
        int b=0;
        for(int i=0;i<n;i++){
            b^=cstr[i]<<(i%4*8);
        }
        return (b%mod+mod)%mod;
    }
}
