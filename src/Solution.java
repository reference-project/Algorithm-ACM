public class Solution {
    public int JumpFloorII(int target) {
        if(target==0)return 1;
        return (int)Math.pow(2.0,(double)(target-1));
    }
}
