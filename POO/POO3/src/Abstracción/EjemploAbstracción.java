package Abstracción;

public class EjemploAbstracción {
    public static void main(String[] args) {
        //No se pueden instanciar objetos desde una clase abstractar
        HijaPersona miPersona=new HijaPersona("Belén","López Vázquez","belen@hotmsil.com","Desengaño, 21");
        miPersona.visitaraPapá();
        System.out.println(miPersona.nombreCompleto());
        System.out.println("----------------------------------------------------------------");
        System.out.println(miPersona.toString());
        System.out.println("---------------------------------------------------------------");
        miPersona.registro();
        miPersona.editar();
        miPersona.borrar();
    }
}
