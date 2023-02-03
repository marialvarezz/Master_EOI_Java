public class EjercicioCapitalize {
    public static void main(String[] args) {
        //1 - Definir variables, nombre, apellido1 y apellido 2
        //2- Convertir cada una en nombre propio
        //3- Imprimir el nombre completo

        String nombre = "MARIA";
        String apellido1 = "alvarez";
        String apellido2 = "MenEndez";

        System.out.println(nombre.toUpperCase().charAt(0)+ nombre.substring(1).toLowerCase());
        System.out.println(apellido1.toUpperCase().charAt(0) + apellido1.substring(1).toLowerCase());
        nombre = (nombre.toUpperCase().charAt(0)+ nombre.substring(1).toLowerCase());
        apellido1 = (apellido1.toUpperCase().charAt(0) + apellido1.substring(1).toLowerCase());
        apellido2 = (apellido2.toUpperCase().charAt(0) + apellido2.substring(1).toLowerCase());
        System.out.println(nombre + " " + apellido1 + " " + apellido2);
        nombre = "Juan ANtonio";
        apellido1 = "DE LA ROSA";
        apellido2 = "san pablo-parra";
        String nombreCompleto = (nombre + " " + apellido1 + " " + apellido2);
        nombreCompleto = nombreCompleto.replace("-"," - ");
        String[] matriz = nombreCompleto.split(" ");
        String nombreCapitalizado = " ";
        for(int i=0;i<matriz.length; i++) {
            //recorrer la matriz
            System.out.println("matriz[" + i + "]" + matriz[i].substring(0,1).toUpperCase() + matriz[i].substring(1).toLowerCase());
            nombreCapitalizado += matriz[i].substring(0,1).toUpperCase() + matriz [i].substring(1).toLowerCase() + " ";
        }
        nombreCapitalizado = nombreCapitalizado.replace(" - ","-");
        System.out.println("nombre comleto " + nombreCapitalizado);
    }
}
