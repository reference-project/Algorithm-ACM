import sort.ShellSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a={3,1};
        ShellSort.shellSort(a);
        System.out.println(Arrays.toString(a));
    }
}