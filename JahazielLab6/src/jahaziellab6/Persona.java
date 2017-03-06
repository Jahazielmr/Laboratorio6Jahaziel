package jahaziellab6;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

public class Persona {
    
    protected int edad;
    protected String nombre, colorPiel, ID,  Nacionalidad, Lugar_Nacimiento;
    protected JTree arbo_genealogico;
    ArrayList <Familiar> familiar = new ArrayList();

    public Persona() {
    }

    public Persona(int edad, String nombre, String colorPiel, String ID, String Nacionalidad, String Lugar_Nacimiento, JTree arbo_genealogico, ArrayList<Familiar> familiar) {
        this.edad = edad;
        this.nombre = nombre;
        this.colorPiel = colorPiel;
        this.ID = ID;
        this.Nacionalidad = Nacionalidad;
        this.Lugar_Nacimiento = Lugar_Nacimiento;
        this.arbo_genealogico = arbo_genealogico;
        this.familiar = familiar;
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getLugar_Nacimiento() {
        return Lugar_Nacimiento;
    }

    public void setLugar_Nacimiento(String Lugar_Nacimiento) {
        this.Lugar_Nacimiento = Lugar_Nacimiento;
    }

    public JTree getArbo_genealogico() {
        return arbo_genealogico;
    }

    public void setArbo_genealogico(JTree arbo_genealogico) {
        this.arbo_genealogico = arbo_genealogico;
    }

    public ArrayList<Familiar> getFamiliar() {
        return familiar;
    }

    public void setFamiliar(ArrayList<Familiar> familiar) {
        this.familiar = familiar;
    }

    
    
    

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
    
    
}
