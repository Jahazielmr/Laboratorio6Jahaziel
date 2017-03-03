package jahaziellab6;

import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

public class Jefe extends Persona{
    
    private String Seccion_trabajo;
    private ArrayList <Empleados> empleados;//Trabajan en la misma seccion del jefe 
    private int Clientes_Atendidos;
    private float Ganancia_actual;

    public Jefe() {
        super();
    }

    public Jefe(String Seccion_trabajo, ArrayList<Empleados> empleados, int Clientes_Atendidos, float Ganancia_actual, int edad, String nombre, String colorPiel, String ID, String Nacionalidad, String Lugar_Nacimiento, DefaultTreeModel arbo_genealogico, Familiar familiar) {
        super(edad, nombre, colorPiel, ID, Nacionalidad, Lugar_Nacimiento, arbo_genealogico, familiar);
        this.Seccion_trabajo = Seccion_trabajo;
        this.empleados = empleados;
        this.Clientes_Atendidos = Clientes_Atendidos;
        this.Ganancia_actual = Ganancia_actual;
    }

    public String getSeccion_trabajo() {
        return Seccion_trabajo;
    }

    public void setSeccion_trabajo(String Seccion_trabajo) {
        this.Seccion_trabajo = Seccion_trabajo;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    public int getClientes_Atendidos() {
        return Clientes_Atendidos;
    }

    public void setClientes_Atendidos(int Clientes_Atendidos) {
        this.Clientes_Atendidos = Clientes_Atendidos;
    }

    public float getGanancia_actual() {
        return Ganancia_actual;
    }

    public void setGanancia_actual(float Ganancia_actual) {
        this.Ganancia_actual = Ganancia_actual;
    }

    @Override
    public String toString() {
        return "Jefe{" + "Seccion_trabajo=" + Seccion_trabajo + ", empleados=" + empleados + ", Clientes_Atendidos=" + Clientes_Atendidos + ", Ganancia_actual=" + Ganancia_actual + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
