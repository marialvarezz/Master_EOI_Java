public class EjecutarOS {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try{
           if(System.getProperty("os.name").toLowerCase().contains("windows")){
               proceso = rt.exec("notepad");
           }else{
               proceso= rt.exec("open -a Notes");
           }
           proceso.waitFor();
        }catch (Exception e){
            System.err.println("Comando desconocido: "+ e.getLocalizedMessage());
            System.exit(1);
        }
    }
}
