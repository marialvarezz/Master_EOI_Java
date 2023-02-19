public class EjemploHerencia  {
    public static void main(String[] args) {
        Automóvil coche=new Automóvil();
        coche.ruedas=4;
        coche.combustible="Hibrido";
        coche.abrirMaletero();
        coche.claxon();
        coche.avanzar();
        System.out.println(coche.toString());

        System.out.println("----------------------------------------------");
        Motocicleta miMoto =new Motocicleta();
        System.out.println("miMoto.ruedas = " + miMoto.ruedas);
        miMoto.transmisión="Cadena";
        miMoto.marca="Suzuki";
        miMoto.modelo="Intruder VL800";
        miMoto.potencia= 75;
        System.out.println(miMoto.toString());
        miMoto.claxon();
        miMoto.acelerarPuño();
        System.out.println("-----------------------------------------------");
        TodoTerreno miTodoterreno= new TodoTerreno();
        //Propias de automóvil
        miTodoterreno.ruedas=4;
        miTodoterreno.combustible="Híbrido";
        miTodoterreno.abrirMaletero();
        //Propias de vehiculo
        miTodoterreno.marca="Ford";
        miTodoterreno.modelo="Mondeo";
        miTodoterreno.potencia=75;
        miTodoterreno.avanzar();
        miTodoterreno.claxon();
        //Propias de todoterreno
        miTodoterreno.reductora="10.1";
        miTodoterreno.cabrestante="Winch";
        miTodoterreno.vadearRio();
        System.out.println(miTodoterreno.toString());
        System.out.println(miTodoterreno.getDiseñador());
    }
}
