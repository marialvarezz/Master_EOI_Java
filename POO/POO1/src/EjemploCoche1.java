public class EjemploCoche1 {
    public static void main(String[] args) {
        Coche1 cocheMaría=new Coche1();
        System.out.println("cocheMaría.getMarca() = " + cocheMaría.getMarca());
        System.out.println("cocheMaría.getMarca() = " + cocheMaría.getMarca());
        System.out.println("--------------------------------------------------------------------");
        System.out.println("cocheMaría.getKm() = " + cocheMaría.getKm());
        cocheMaría.setMarca("Renault");
        cocheMaría.setDeposito(50);
        System.out.println("cocheMaría.getMarca() = " + cocheMaría.getMarca());
        System.out.println("cocheMaría.consumo(800) = " + cocheMaría.consumo(800));
        System.out.println("cocheMaría.consumo(700) = " + cocheMaría.consumo(700));
       // System.out.println("cocheMaría.getKm() = " + cocheMaría.getKm()); NO SE PUEDE PORQUE NO TIENE EL GETTER Y SETTER
        // DEFINIDOS
        System.out.println("----------------------------------------------------------------------");
        //Constructores
        Coche1 elCoche =new Coche1("ford");
        System.out.println("elCoche.getMarca() = " + elCoche.getMarca());
        System.out.println("elCoche.getKm() = " + elCoche.getKm());
        System.out.println("-------------------------------------------------------------------------");
        Coche1 cocheGerard = new Coche1("Renault","Twingo");
        System.out.println("cocheGerard.getMarca() = " + cocheGerard.getMarca());
        System.out.println("cocheGerard.getModelo() = " + cocheGerard.getModelo());
        System.out.println("cocheGerard.getKm() = " + cocheGerard.getKm());
    }
}
