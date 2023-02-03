public class EjemploSwitch {
    public static void main(String[] args) {
        int mes = 4;
        String nombreMes = "";
        
        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            default:
                nombreMes = "Después de mayo";
        }
        System.out.println("nombreMes = " + nombreMes);
        if (mes ==1){
            nombreMes = "Enero";
    } else if (mes == 2) {
            nombreMes = "Febrero";
        } else if (mes == 3) {
            nombreMes = "Marzo";
        } else if (mes == 4) {
            nombreMes = "Abril";
        }
        System.out.println("nombreMes = " + nombreMes);

        //Ejercicio notas
        int nota =8;
        String notaFinal ="";
        switch (nota){
            case 10:
                notaFinal = "Matricula";
                break;
            case 9:
                notaFinal = "Sobresaliente";
                break;
            case 8:
            case 7:
                notaFinal = "Notable";
                break;
            case 6:
                notaFinal = "Bien";
                break;
            case 5:
                notaFinal = "Aprobado";
                break;
            default:
                notaFinal = "Suspenso";
        }
        System.out.println("Nota Final = " + notaFinal);

        //Con String
        String camiseta = "verde";
        String serigrafia = "";
        switch (camiseta){
            case "roja":
                serigrafia = "blanco";
                break;
            case "verde":
                serigrafia = "rojo";
                break;
            default:
                serigrafia="negro";
        }
        System.out.println("Serigrafia = " + serigrafia);

    }
    
}
