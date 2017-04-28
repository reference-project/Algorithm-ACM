import java.util.Scanner;

public class partern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String p = scanner.nextLine();
        boolean b=partern(s,p,0,0);
        System.out.println(b);
    }
    static boolean partern(String s,String p,int sa,int pa){
        int pn=p.length();
        int sn=s.length();
        if(pa==pn&&sa==sn)return true;
        char c='!';
        char c2='!';
        if(pa<pn)
            c=p.charAt(pa);
        if(sa<sn)
            c2=s.charAt(sa);
        if(c=='*'){
            for(int i=sa;i<=sn;i++){
                if(partern(s,p,i,pa+1))
                    return true;
            }
            return false;
        }else{
            if(c==c2||c=='?'){
                return partern(s,p,sa+1,pa+1);
            }
            else
                return false;
        }
    }
}