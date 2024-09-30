public class Estudiante {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double evaluacion;
    private double ingles;

    // Constructor
    public Estudiante(String m, String n) {
        this.matricula = m;
        this.nombre = n;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

}
public class Estudiante{
    public double getPromedio(){
        this.promedio = promedio;}

        public void setPromedio(double promedio){
            this.promedio = promedio;
        }   

        @Override
        public String toString() {
            return "Estudiante{" + matricula + ", nombre=" + nombre + promedio;

}

