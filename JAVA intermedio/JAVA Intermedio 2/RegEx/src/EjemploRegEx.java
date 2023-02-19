import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploRegEx {
    public static void main(String[] args) {
        String texto="En un lugar de La Mancha de cuyo nombre no quiero acordarme";
        String patron="mancha";
        búsqueda(patron,texto);
        patron="lugar|sitio|ubicación"; //Si se cumplen las tres = true
        búsqueda(patron,texto);

        patron=".de";
        búsqueda(patron,texto);

        patron="^en";//Que empiece por
        búsqueda(patron,texto);

        patron="me$";//Que termine en
        búsqueda(patron,texto);

        patron="\\d";//Que contenga un dígito (0...9)
        búsqueda(patron,texto);

        patron="\\s"; //Si contiene espacios en blanco
        búsqueda(patron,texto);

        patron="\\bnombre"; //Que empieza por lo que hay tras la \b
        búsqueda(patron,texto);

        patron="[x-z]";//Que contenga letras o números definidas en un rango []
        búsqueda(patron,texto);
        patron="[5-9]";
        búsqueda(patron,texto);
        patron="lug{3}";//Que contenga luggg
        búsqueda(patron,texto);
        patron="[5-9]{2}";//2 Dígitos comprendidos entre 0 y 9 consecutivos
        búsqueda(patron,texto);

        //Password con al menos una Mayúscula, minúscula, dígito y carácter especial
        texto="44Acb%dede";
        patron="(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[@#%^&]).{8,}";
        búsqueda(patron,texto);

        //Email
        texto="eoi_edu@eoi.es";
        patron="^\\w+[\\w-\\.]*\\@\\w+((-\\w+)|(\\w*))\\.[a-z]{2,}$";
        búsqueda(patron,texto);

    }

    public static void búsqueda (String patron,String texto){
        //1-Hago el Pattern  2-Hago el Matcher
        Pattern miPatron=Pattern.compile(patron,Pattern.CASE_INSENSITIVE);
        Matcher miMatcher= miPatron.matcher(texto);
        System.out.println("miMatcher.find(" + patron + ") = " + miMatcher.find());
    }
}
