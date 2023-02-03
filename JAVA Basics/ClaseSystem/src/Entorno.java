import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Entorno {
    public static void main(String[] args) {
        //variables del entorno 1 a 1
        System.out.println("usuario = " + System.getProperty("user.name"));
        System.out.println("directorio = "+ System.getProperty("user.dir"));
        System.out.println("version Java = " + System.getProperty("java.version"));

        //Todas las variables del entorno
        Properties propiedades = System.getProperties();
        propiedades.list(System.out);
        System.out.println("------------------------------------------");

        //crear variables del entorno
        propiedades.setProperty("config.puerto.servidor","8080");
        System.out.println("propiedades = " + propiedades);

        propiedades = System.getProperties();
        propiedades.list(System.out);
        System.out.println("----------------------------------------------------------");

        // cargar variables de entorno desde un archivo
        try{
        FileInputStream archivo =new FileInputStream("src/config.properties");
        propiedades.load(archivo);
        System.setProperties(propiedades);
        propiedades.list(System.out);
        }catch (FileNotFoundException e){
            //Tratar el error de archivo no encontrado
            System.err.println("File cannot be found "+ e.getMessage());
        }catch (IOException e){
            //tratar el error del archivo
            System.out.println("File cannot be read "+ e.getMessage());
        }
        System.out.println("------------------------------------------------------------");

        //variables del entorno del sistema operativo
        Map<String, String>varEntorno = System.getenv();
        System.out.println("varEntorno = " + varEntorno);
        System.out.println("Usuario = " + System.getenv("USERNAME"));
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));
        System.out.println("varEntorno.keyset() -> " + varEntorno.keySet());

        for (String clave : varEntorno.keySet()){
            System.out.println("clave = " + clave + " -> valor = "+ System.getenv(clave));
        }
        }
    }

