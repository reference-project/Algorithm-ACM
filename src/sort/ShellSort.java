package sort;

//希尔排序
public class ShellSort {
    public static void shellSort(int[] a){
        int n=a.length;
        for(int d=n/2;d>0;d/=2){//间距从n/2到1
            for(int i=0;i<d;i++){//对于每个d，不同的分组
                for(int j=i+d;j<n;j+=d){
                    for(int k=j;k>=d;k-=d){//对于i分组的每一个元素
                        if(a[k]<a[k-d]){
                            int tmp=a[k];
                            a[k]=a[k-d];
                            a[k-d]=tmp;
                        }else{
                            break;
                        }
                    }
                }
            }
        }
    }
}
