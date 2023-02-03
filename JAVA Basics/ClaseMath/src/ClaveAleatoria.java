import java.util.Random;

public class ClaveAleatoria {
    public static void main(String[] args) {
        //Generar clave aleatoria de n digitos
        //y que contenga a..z,A...Z,0....1,Caráteres especias
        System.out.println("la contraseña es -> " + generaPass(10));
        System.out.println("----------------------------------------------------------");

        //Mi opción
       Random objetoRndm = new Random();
       int k=0;
       int n = 10;
       String pasword = "";
       while (k<n){
       int i = objetoRndm.nextInt(33,127);
       char pas = (char) i;
       pasword += String.valueOf(pas);
       k++;
       }
        System.out.println("tu contraseña es -> " + pasword);


    }
    public static String generaPass (int n){
        String pasword ="";
        String base="ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz0123456789$%&_";
        Random objrandom= new Random();
        for (int l=0;l<n;l++){
            int d = objrandom.nextInt(base.length());
            pasword += base.charAt(d);
        }
        return pasword;
    }
}
