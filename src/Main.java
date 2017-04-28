import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int [][] jz=new int[n][n];
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++)
                    jz[i][j]=sc.nextInt();
            for(int i=0;i<n;i++) {
                for (int j = 0; j < n-1; j++)
                    System.out.print(jz[j][i]+" ");
                System.out.println(jz[n-1][i]);
            }
        }
    }
}