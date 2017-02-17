package lab5_davidguillen;
public class Empleado extends Persona{
    private String empleo;

    public Empleado() {
        super();
    }

    public Empleado(String empleo, String nombre, int edad, String id, String id_boletos, String departamento, int dinero) {
        super(nombre, edad, id, id_boletos, departamento, dinero);
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "empleo=" + empleo + '}';
    }
    
}
