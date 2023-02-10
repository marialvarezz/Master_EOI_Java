public enum Asignaturas {

    LENG ("Lengua castellana","010"),
    EF("Educación física","021"),
    INGLÉS("Lengua ext Inglés","032"),
    MAT("Matemáticas I      ","043"),
    HIST("Historia de España","054"),
    FIS("Física           ","065"),
    TIC("Tecnología       ","076"),
    OOO("Sin especificar","000");

    private String nombre;
    private String código;

    //Constructor
    Asignaturas(String nombre,String código) {
        this.nombre = nombre;
        this.código= código;
    }

    //Getter

    public String getNombre() {
        return nombre;
    }

    public String getCódigo() {
        return código;
    }
}
