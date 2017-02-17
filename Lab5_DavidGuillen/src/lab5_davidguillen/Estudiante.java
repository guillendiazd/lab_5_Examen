package lab5_davidguillen;
public class Estudiante extends Persona{
    private String carrera;

    public Estudiante() {
        super();
    }

    public Estudiante(String carrera, String nombre, int edad, String id, String id_boletos, String departamento, int dinero) {
        super(nombre, edad, id, id_boletos, departamento, dinero);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
