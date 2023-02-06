public class EjemploEnum {
    public static void main(String[] args) {
        Color miColor = Color.VERDE;
        System.out.println("miColor = " + miColor);
        System.out.println("------------------------------------");
        //Convertir el conjunto de valores en una matriz
        System.out.println(Color.values()[3]);
        //Recorrer valores enumeradores
        for(Color elColor:Color.values()){
            System.out.println("elColor = " + elColor);
        }
        System.out.println("--------------------------------------------");
        //Toma de decisiones - Control de flujo
        //if
        miColor=Color.AZUL;
        if(miColor==Color.AZUL){
            System.out.println("El color es azul");
        }else {
            System.out.println("El color no es azul");
        }
        System.out.println("---------------------------------------");
        //Switch - notación 1
        switch (miColor){
            case BLANCO:
                System.out.println("El color es blanco");
                System.out.println("otra");
                break;
            case VERDE:
                System.out.println("El color es verde");
                System.out.println("otra más");
                break;
            case AZUL:
                System.out.println("El color es azul");
                System.out.println("otra más aún");
                break;
            default:
                System.out.println("El color no es azul ni verde ni blanco");
        }
        //switch - notación 2
        miColor=Color.BLANCO;
        switch (miColor){
            case BLANCO -> //Si es más de 1 instrucción se necesitan llaves
                System.out.println("El color es blanco");
            case VERDE -> System.out.println("El color es verde");
            case AZUL-> System.out.println("El color es azul");
            default ->  System.out.println("El color no es azul ni verde ni blanco");


        }

    }
}
