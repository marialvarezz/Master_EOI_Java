import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try {
            FileWriter escribir=new FileWriter("miarchivo.txt",true);
            escribir.write("\nPelo hacia atrás, sonrisa retorcida\n" +
                    "Intentará abordarme por segunda vez\n" +
                    "No se da cuenta que no me interesa\n" +
                    "Que lo que diga o lo que haga lo conozco bien");
            escribir.close();
            System.out.println("Escritura terminada");

        }catch (IOException e){
            System.out.println("Ha habido un problema de escritura");
            System.out.println(e.toString());
        }
    }
}
