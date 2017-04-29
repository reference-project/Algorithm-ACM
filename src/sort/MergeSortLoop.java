package sort;

import java.util.Arrays;

/**
 * Created by 不语恋 on 2017/4/28.
 */
public class MergeSortLoop{
    public static void main(String[] args){
        int[] a={3,2,16,9,1,5,4,7,6};
        mergeSortLoop(a);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSortLoop(int[] a){
        int s=1;
        int n=a.length;
        int[] b=new int[n];
        System.arraycopy(a,0,b,0,n);
        while (s<n){
            int i;
            for(i=0;i<n-2*s;i+=2*s){
                merge(a,b,i,i+s,i+2*s);
            }
            if(n-i>s)merge(a,b,i,i+s,n);
            s+=s;
            if(s>=n){
                System.arraycopy(b,0,a,0,n);
                return;
            }
            for(i=0;i<n-2*s;i+=2*s){
                merge(b,a,i,i+s,i+2*s);
            }
            if(n-i>s)merge(b,a,i,i+s,n);
            s+=s;
        }
    }
    public static void merge(int[] a,int[] b,int left,int m,int right){
        int i=left,j=m,k=left;
        while (i<m&&j<right){
            if(a[i]<=a[j])b[k++]=a[i++];
            else b[k++]=a[j++];
        }
        if(i<m){
            for(;i<m;i++)b[k++]=a[i];
        }else{
            for(;j<right;j++)b[k++]=a[j];
        }
    }
}
