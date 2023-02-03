public class Metodos {
    public static void main(String[] args) {
        System.out.println("suma(3,5) = " +suma(3,5) );
        bienvenida();
        imprimeNombre("María",20);


    }
    public static int suma (int a, int b){
        return a + b;
    }
    public static void bienvenida (){
        System.out.println("Hola,bienvenido al apasionante mundo de Java");
    }
    public static void imprimeNombre(String nombre,int edad){
        System.out.println("Tu nombre es: "+nombre + " y tiene "+ edad +" años");
    }




}
