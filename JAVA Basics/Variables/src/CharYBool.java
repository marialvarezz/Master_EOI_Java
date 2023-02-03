public class CharYBool  {
    public static void main(String[] args) {
        //Tipo char
        char caracter = '@';
        System.out.println("caracter = " + caracter);
        char character1 = '\u0021';
        System.out.println("character1 = " + character1);
        char caracter2 = 66;
        System.out.println("caracter2 = " + caracter2);
        char caracter3 = 'A';
        System.out.println("caracter3 = " + caracter3);
        System.out.println("-----------------------------------");

        //Tipo booleano
        boolean dato = true;
        System.out.println("dato = " + dato);

        int a,b;
        a = 4;
        b = 7;
        dato = a > b;
        System.out.println("dato = " + dato);

        dato = a < b;
        System.out.println("dato = " + dato);
        
        dato = (b-a)==3;
        System.out.println("dato = " + dato);
    }
}
