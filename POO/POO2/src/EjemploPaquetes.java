import subpaquete.Amigos;
import subpaquete.PersonaSubpaquete;
public class EjemploPaquetes {
    public static void main(String[] args) {
        PersonaSubpaquete vecino = new PersonaSubpaquete("Ana","García","ana@eoi.com", Amigos.CONCHA,"Ave del paraíso");
        System.out.println(vecino.toString());
    }
}
