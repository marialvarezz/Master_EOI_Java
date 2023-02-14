import javax.swing.*;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioHashMap {
    public static void main(String[] args) {
        //partiendo de una lista email->usuario
        //crear un método que localice el email introduciendo el nombre por Consola o emergente
        HashMap<String,String> emails=new HashMap<>();
        emails.put("juan@eoi.es","Juan");
        emails.put("maria@eoi.es","María");
        emails.put("ana@eoi.es","Ana");
        emails.put("anaperez@eoi.es","Ana");
        emails.put("paco@eoi.es","Paco");
        String nombre;
        //nombre= JOptionPane.showInputDialog(null,"Introduce un nombre"); //- por ventana emergente


        buscarEmail(consola(),emails);
}
        public static String consola(){
        Scanner scner=new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre= scner.nextLine();
        return nombre;
        }

        public static void buscarEmail(String nombre,HashMap<String,String>emails){

        emails.forEach((Email,Usuario)->{
                if (Usuario.equals(nombre)){
                    System.out.println("Email -> " + Email+ "/ Usuario -> " + Usuario);

                }
            });

        }

}
