
package logica;


public class Empleado {
    int id;
    String nombre;
    String apellido;
    String puestoLaboral;
    double sueldo;

    public Empleado(int id, String nombre, String apellido, String puestoLaboral, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puestoLaboral = puestoLaboral;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
