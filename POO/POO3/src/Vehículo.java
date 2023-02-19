public class Vehículo {
    String marca;
    String modelo;
    float potencia;
    private String diseñador="Pepe Pérez";
    public void claxon(){
        System.out.println("piiiiiiiiiiiiiiiiiiii");
    }
    public void avanzar(){
        System.out.println("Avanzo");
    }

    public String getDiseñador() {
        return diseñador;
    }
}
