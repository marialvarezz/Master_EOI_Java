public class EjemploWhile {
    public static void main(String[] args) {
        //recorrer los 20 primeros números naturales
        int contador = 0;
        while (contador <= 20){
            System.out.println("contador -> " + contador);
            contador++;
        }
        System.out.println("-------------------------------------------");
        //do while
        contador = 0;
        do {
            System.out.println("contador -> " + contador);
            contador++;
        }while (contador<=20);
        System.out.println("--------------------------------------------------------");

        //Recorrer matriz
        String[] coches={"Volvo","Renault","Seat","Citroen"};
        //while
        int i = 0;
        while(i< coches.length){
            System.out.println("coches["+i+"] -> "+ coches[i]);
            i++;
        }
        i= 0;
        System.out.println("---------------------------------------------------------------");
        do {
            System.out.println("coches ["+i+"] ->" + coches[i]);
            i++;
        }while (i< coches.length);
        System.out.println("-----------------------------------------------------------");

        //Diferente condición de salida
        boolean salir = false;
        i=0;
        while (!salir){
            System.out.println("coches ["+i+"] ->" + coches[i]);
            i++;
            if (coches[i] == "Seat"){
                salir=true;
            }
        }
        System.out.println("----------------------------------------------------");
        //break continue
        //break
        for(String marca: coches){
            System.out.println("marca = " + marca);
            if (marca == "Seat"){
                break;
            }
        }
        System.out.println("---------------------------------------------------");
        i = 0;
        while(i< coches.length){
            System.out.println("coches["+i+"] -> "+ coches[i]);
            if (coches[i]=="Seat") break;
            i++;
        }

        System.out.println("-------------------------------------------------");
        for(String marca: coches){
            if (marca == "Seat"){
               continue;
    }
            System.out.println("marca = " + marca);
        }
        System.out.println("---------------------------------------------------");
        i = 0;
        while(i< coches.length){
            if (coches[i]=="Seat"){
            i++;
            continue;
        }
            System.out.println("coches["+i+"] -> "+ coches[i]);
            i++;
        }

        }
}
