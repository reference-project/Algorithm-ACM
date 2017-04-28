import java.util.Arrays;

/**
 * Created by 不语恋 on 2017/4/28.
 */
public class MergeSort{
    public static void main(String[] args){
        int[] a={1,2,16,9,1,3,4,2,6};
        mergeSort(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void mergeSort(int[] a,int left,int right){
        if(right-left<2)return;
        int m=(left+right)/2;
        mergeSort(a,left,m);
        mergeSort(a,m,right);
        merge(a,left,m,right);
    }
    public static void merge(int[] a,int left,int m,int right){
       // System.out.println(left+" "+right);
        int[] b=new int[right-left];
        int i=left,j=m,k=0;
        while (i<m&&j<right){
            if(a[i]<=a[j])b[k++]=a[i++];
            else b[k++]=a[j++];
        }
        if(i<m){
            for(;i<m;i++)b[k++]=a[i];
        }else{
            for(;j<right;j++)b[k++]=a[j];
        }
        System.arraycopy(b,0,a,left,b.length);
    }
}
