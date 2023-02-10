public class DatosInstituto {
    private String nombre="IES AQNHQV";
    private String dirección="Desengaño,21 - 30000 Madrid";
    private String tlfn="985 777 777";
    private String email="anhqv@hotmail.com";
    private String nombreProf;

    public DatosInstituto(String nombreProf) {
        this.nombreProf = nombreProf;
    }

    @Override
    public String toString() {
        return nombre  +
                "\n" + dirección + '\'' +
                "\n" + tlfn  +
                " - " + email  +
                "\nTutor: " + nombreProf;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
