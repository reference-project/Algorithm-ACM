//寻找两个有序数组的所有元素的中位数，时间复杂度o(log(min(n,m))的方法
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>=n2){
            return findMedianSortedArrays2(nums1,nums2);
        }else{
            return findMedianSortedArrays2(nums2,nums1);
        }
    }
    int getInt(int[] num,int n){
        if(n<0)return Integer.MIN_VALUE;
        if(n>=num.length)return Integer.MAX_VALUE;
        return num[n];
    }
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int low=0,high=n2;
        int mid=0;
        int sum=n/2;
        int n1s=0;
        while(low<=high){
            mid=(low+high)/2;
            n1s=sum-mid;
            int ml=getInt(nums1,n1s-1);
            int mr=getInt(nums1,n1s);
            int nl=getInt(nums2,mid-1);
            int nr=getInt(nums2,mid);
            if(Math.max(ml,nl)<=Math.min(mr,nr)){
                if(n%2==1)
                    return Math.min(mr,nr);
                else
                    return (double)(Math.min(mr,nr)+Math.max(ml,nl))/2.0;
            }
            if(nl>mr){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1.0;
    }
}
