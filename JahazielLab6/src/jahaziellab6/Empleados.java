package jahaziellab6;

import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

public class Empleados extends Persona{
    private String seccion_trabajo, estado;
    private int Hora_e, Hora_s, sueldo ;

    public Empleados() {
        super();
    }

    public Empleados(String seccion_trabajo, String estado, int Hora_e, int Hora_s, int sueldo, int edad, String nombre, String colorPiel, String ID, String Nacionalidad, String Lugar_Nacimiento, JTree arbo_genealogico, ArrayList <Familiar> familiar) {
        super(edad, nombre, colorPiel, ID, Nacionalidad, Lugar_Nacimiento, arbo_genealogico, familiar);
        this.seccion_trabajo = seccion_trabajo;
        this.estado = estado;
        this.Hora_e = Hora_e;
        this.Hora_s = Hora_s;
        this.sueldo = sueldo;
    }

    

    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getHora_e() {
        return Hora_e;
    }

    public void setHora_e(int Hora_e) {
        this.Hora_e = Hora_e;
    }

    public int getHora_s() {
        return Hora_s;
    }

    public void setHora_s(int Hora_s) {
        this.Hora_s = Hora_s;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
    
}
