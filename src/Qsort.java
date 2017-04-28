import java.util.Arrays;

/**
 * Created by 不语恋 on 2017/4/28.
 */
public class Qsort {
    public static void main(String[] args){
        int[] a={1,2,6,8,1,3};
        qsort(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void qsort(int[] a,int p,int r){
        if(p+1<r){
            int q=partition(a,p,r);
            qsort(a,p,q-1);
            qsort(a,q+1,r);
        }
    }
    public static int partition(int[] a,int p,int r){
        int i=p,j=r;
        int x=a[p];
        while (true){
            while (a[++i]<x&&i<r);
            while (a[--j]>x&&j>=p);
            if(i>=j)break;
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        a[p]=a[j];
        a[j]=x;
        return j;
    }
}
