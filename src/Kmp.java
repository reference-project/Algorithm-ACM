//字符串匹配kmp算法
public class Kmp {
    public int kmp(String s,String p){
        int len=p.length();
        int j=0;

        int next[]=new int[len+1];//next表示长度为i的字符串前缀和后缀的最长公共部分，从1开始
        next[0]=next[1]=0;

        for(int i=1;i<len;i++)//i表示字符串的下标，从0开始
        {
            //j在每次循环开始都表示next[i]的值，同时也表示需要比较的下一个位置
            while(j>0&&p.charAt(i)!=p.charAt(j))j=next[j];
            if(p.charAt(i)==p.charAt(j))j++;
            next[i+1]=j;
        }
        j = 0;
        for (int i = 0; i < s.length(); i++) {
            while (j > 0 && s.charAt(i) != p.charAt(j))
                j = next[j];
            if (s.charAt(i) == p.charAt(j))
                j++;
            if (j == p.length()) {
                return i-j+1;
            }
        }
        return -1;
    }
}
