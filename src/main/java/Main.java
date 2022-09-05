import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] P = new int[12];
        int[] q = new int[12];
        int[] d = new int[12];
        int p = 0;
        int r = 0;
        for(int i = 0; i<P.length; i++){
            P[i] = rd.nextInt(10);
            System.out.print(P[i]+" ");
        }
        System.out.println();
        for(int i = 0; i<P.length; i++){
            q[i] = rd.nextInt(9)+1;
            System.out.print(q[i]+" ");
        }
        for(int i=0; i<d.length; i++){
            p = p + (P[i]-q[i]);
        }
        System.out.println();
        for(int i = 0; i<d.length; i++){
            r=P[i]/q[i];
            d[i]=p*r;
            System.out.print(d[i]+" ");
        }
    }
}