package lab5_davidguillen;
public class Persona {
    private String nombre;
    private int edad;
    private String id;
    private String id_boletos;
    private String departamento;
    private int dinero;

    public Persona() {
    }

    public Persona(String nombre, int edad, String id, String id_boletos, String departamento, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.id_boletos = id_boletos;
        this.departamento = departamento;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_boletos() {
        return id_boletos;
    }

    public void setId_boletos(String id_boletos) {
        this.id_boletos = id_boletos;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", id_boletos=" + id_boletos + ", departamento=" + departamento + ", dinero=" + dinero + '}';
    }
    
}
