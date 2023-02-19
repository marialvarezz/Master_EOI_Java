import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploJavaTime {
    public static void main(String[] args) {
        //Fecha
        LocalDate objetoFecha=LocalDate.now() ;
        System.out.println("objetoFecha = " + objetoFecha);
        
        //Formato de fecha dd/MM/yyyy
        DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("objetoFecha.format(formatoFecha) = " + objetoFecha.format(formatoFecha));
        System.out.println(formatoFecha.toString());

        //Hora
        LocalTime objetoHora=LocalTime.now();
        System.out.println(objetoHora);
        System.out.printf("La hora actual es %.8s y no otra\n", objetoHora ); //con el printf - casi no se usa

        //Formato hh:mm:ss
        DateTimeFormatter formatohora=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("objetoHora.format(formatohora) = " + objetoHora.format(formatohora));
        
        //Fecha y hora simultáneamente
        LocalDateTime objetofyh=LocalDateTime.now();
        System.out.println("objetofyh = " + objetofyh);
        DateTimeFormatter fomatofyh=DateTimeFormatter.ofPattern("dd/MM/yyyy - kk:mm:ss ");
        System.out.println("objetofyh.format(fomatofyh) = " + objetofyh.format(fomatofyh));

        //Establecer Fecha y hora
        objetofyh=LocalDateTime.of(2022,01,01,01,00,00);
        System.out.println(objetofyh.format(fomatofyh));
    }
}
