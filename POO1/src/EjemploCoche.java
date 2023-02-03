public class EjemploCoche {
    public static void main(String[] args) {
        //Método estático
        Coche.llamarEmergencias();
        //crear un objeto
        Coche miCoche=new Coche();
        Coche tucoche=new Coche();
        miCoche.marca ="Ford";
        miCoche.modelo="Mondeo";
        miCoche.color="Amarillo";
        miCoche.combustible="Diesel";
        miCoche.cilindrada=2000;
        miCoche.deposito=50;
        System.out.println("miCoche.marca = " + miCoche.marca);
        System.out.println("miCoche.modelo = " + miCoche.modelo);
        System.out.println("miCoche.color = " + miCoche.color);
        System.out.println("miCoche.combustible = " + miCoche.combustible);
        System.out.println("miCoche.cilindrada = " + miCoche.cilindrada);
        System.out.println("miCoche.eCall = " + miCoche.eCall);
        System.out.println("miCoche.consumo(600) = " + miCoche.consumo(600));
        System.out.println("miCoche.consumo(600,25) = " + miCoche.consumo(600,40));


        System.out.println("----------------------------------------------------------------------" );
        //Modificación de datos absolutos
        System.out.println("Coche.distintivo = " + Coche.distintivos);
        System.out.println("miCoche.distintivos = " + miCoche.distintivos);
        System.out.println("tucoche.distintivos = " + tucoche.distintivos);
        miCoche.distintivos="F";
        System.out.println("Coche.distintivo = " + Coche.distintivos);
        System.out.println("miCoche.distintivos = " + miCoche.distintivos);
        System.out.println("tucoche.distintivos = " + tucoche.distintivos);
        
    }
}
