public class Generalidades {
    public static void main(String[] args) {
        //Declaraciones
        String[] colores1= {"azul", "rojo","verde","amarillo","naranja"};
        String[] colores2= new String[5];

//Recorrer las matrices
        for (int i = 0; i< colores1.length; i++){
            System.out.println("colores1 [" + i + "] = " + colores1[i]);
        }
        System.out.println("--------------------------------------------------");
        for (int i = 0; i< colores2.length; i++){
            System.out.println("colores2 [" + i + "] = " + colores2[i]);
        }
        System.out.println("-----------------------------------------------");
        //Asignar valores
        colores2[1]= "azul";
        colores2[0]="verde";
        for (int i = 0; i< colores2.length; i++){
            System.out.println("colores2 [" + i + "] = " + colores2[i]);
        }
        System.out.println("-----------------------------------------------------------");
        //copiar una matriz
        for (int i = 0; i < colores1.length; i++){
            colores2[i]=colores1[i];
        }
        for (int i = 0; i< colores2.length; i++){
            System.out.println("colores2 [" + i + "] = " + colores2[i]);
        }
        System.out.println("----------------------------------------------");
        //inversa
        for (int i = 0; i< colores1.length; i++){
            colores2[colores2.length-(i+1)]= colores1[i];
        }
        for (int i = 0; i< colores2.length; i++){
            System.out.println("colores2[" + i + "] = " + colores2[i] + " -> colores1[" + i + "] = " + colores1[i]);
        }



    }
}
