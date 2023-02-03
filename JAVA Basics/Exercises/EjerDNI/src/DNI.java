public class DNI {
    public static void main(String[] args) {
    int numDni = 45567890;
        System.out.println("dni(numDni) = " + dni(numDni));
        
        

    }
    public static String dni(int numeroDNI){
        int numLetra= numeroDNI%23;
        String[] letra={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String letrafin=letra[numLetra--];
        return letrafin;
    }

}
