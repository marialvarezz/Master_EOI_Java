public class DatosAlumno {
    private String nombre;
    private String apellidos;
    private String curso;
    private String clase;
    private String evaluación;


    //Constructor


    public DatosAlumno(String nombre, String apellidos, String curso,String clase, String evaluación) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.clase=clase;
        this.evaluación=evaluación;
    }

    //toString

    @Override
    public String toString() {
        return "Alumno:  " + apellidos+", " + nombre +
                "\nCurso: " + curso +
                " " + clase
                + "\nEvaluación: " + evaluación;
    }
}
