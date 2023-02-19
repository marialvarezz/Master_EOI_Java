public class EjemploThrow {
    public static void main(String[] args) {
        try {
            comprobarEdad(18);

        }catch (ArithmeticException e){
            System.out.println("e.toString() = " + e.toString());
        }

        System.out.println("FÍN DEL PROGRAMA");
    }

    static void comprobarEdad(int edad){
        if(edad<18){
          throw new ArithmeticException("Acceso denegado");
        }else {
            System.out.println("Acceso permitido");
        }
    }
}
