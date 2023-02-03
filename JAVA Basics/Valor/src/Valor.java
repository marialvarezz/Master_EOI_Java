public class Valor {
    public static void main(String[] args) {
    int argumento = 45;
        System.out.println("main inicio - argumento = " + argumento);
        int resultado = miMetodo(argumento);
        System.out.println("main final - argumento" + argumento);
    }
    public static int miMetodo(int agumento){
        System.out.println("Mi metodo inicio es -> " + agumento);
        agumento = 54;
        System.out.println( "Mi metodo de salida es -> " + agumento);
        return agumento;
    }
}
