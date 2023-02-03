public class Referencia {
    public static void main(String[] args) {
        int[] argumento ={10,20,30,40};
        int vari = 0;
        for(vari= 0;vari< argumento.length;vari++){
            System.out.println(argumento[vari]);
            miMetodo(argumento);
            System.out.println(argumento[vari]);
        }
    }
    public static void miMetodo(int[] matriz){
        for(int vari = 0; vari< matriz.length; vari++){
            matriz[vari]+=5;
        }
    }
}
