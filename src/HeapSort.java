import java.util.Arrays;

/**
 * Created by 不语恋 on 2017/4/28.
 */
public class HeapSort {
    public static void main(String[] args){
        int[] a={3,2,16,9,1,5,4,8,7};
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void heapSort(int[] a){
        heapBuild(a);
        for(int i=a.length-1;i>0;i--){
            int t=a[i];
            a[i]=a[0];
            a[0]=t;
            heapAdjust(a,0,i);
        }
    }
    public static void heapBuild(int[] a){
        int n=a.length;
        for(int i=n/2-1;i>=0;i--){
            heapAdjust(a,i,n);
        }
    }
    public static void heapAdjust(int[] a,int s,int m){
        int lchild=Integer.MIN_VALUE;
        int rchild=Integer.MIN_VALUE;
        int ln=s*2+1;
        if(ln<m){
            lchild=a[ln];
        }
        int rn=s*2+2;
        if(rn<m){
            rchild=a[rn];
        }
        int maxp=ln,max=lchild;
        if(rchild>lchild){
            maxp=rn;
            max=rchild;
        }
        if(max>a[s]){
            int tmp=a[maxp];
            a[maxp]=a[s];
            a[s]=tmp;
            heapAdjust(a,maxp,m);
        }
    }
}
