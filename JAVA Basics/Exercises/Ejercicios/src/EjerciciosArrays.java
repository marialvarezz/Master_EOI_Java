import java.util.Arrays;

public class EjerciciosArrays {
    public static void main(String[] args) {
        int[] a ={1,2,3};
        int[] b={5,6,7};
        int [][] ab = new int[a.length][b.length];
        int [][] cb = new int[2][b.length];
        int k=0;
        int g=0;

            while(g<2){
                while(k<cb.length){
                    cb[g][k]=b[k];
                    k++;
                }
                cb[g][k]+=a[g];
                g++;
            }
        for(int l =0;l<cb.length;l++){
            for (int j=0; j<cb[l].length; j++){
                System.out.println("bidi2[" + l + "]["+j + "] = " + cb [l][j]);
            }
        }


        }


    // ab[][] = {a[k],a[k+1],a[k+2]}{b[0],b[1],b[2]}
    public static void arrayJunta (int[] a,int [] b){


    }


}
