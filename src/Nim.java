//Nim游戏
// 1、有两名选手；
// 2、两名选手交替对游戏进行移动(move)，每次一步，选手可以在（一般而言）有限的合法移动集合中任选一种进行移动；
// 3、对于游戏的任何一种可能的局面，合法的移动集合只取决于这个局面本身，不取决于轮到哪名选手操作、以前的任何操作、
//    骰子的点数或者其它什么因素；
// 4、如果轮到某名选手移动，且这个局面的合法的移动集合为空（也就是说此时无法进行移动），则这名选手负。
public class Nim {
    //先走的人必赢返回true;
    public static boolean nim(int[] a){
        int n=a.length;
        int s=0;
        for(int i=0;i<n;i++)
            s^=a[i];
        if(s==0)return false;
        else return true;
    }
}
