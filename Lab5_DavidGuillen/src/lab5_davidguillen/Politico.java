package lab5_davidguillen;
public class Politico extends Persona{
    private String Partido;

    public Politico() {
        super();
    }

    public Politico(String Partido, String nombre, int edad, String id, String id_boletos, String departamento, int dinero) {
        super(nombre, edad, id, id_boletos, departamento, dinero);
        this.Partido = Partido;
    }

    public String getPartido() {
        return Partido;
    }

    public void setPartido(String Partido) {
        this.Partido = Partido;
    }

    @Override
    public String toString() {
        return super.toString() + "Politico{" + "Partido=" + Partido + '}';
    }
    
}
