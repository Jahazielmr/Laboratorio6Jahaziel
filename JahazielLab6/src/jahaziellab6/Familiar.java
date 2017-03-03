package jahaziellab6;

import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

public class Familiar {
    
    private Familiar familiar_padre;
    private ArrayList <Familiar> familiares_Hijos = new ArrayList();
    protected int edad;
    protected String nombre, colorPiel, ID,  Nacionalidad, Lugar_Nacimiento;

    public Familiar() {
    }
    
    

    public Familiar(Familiar familiar_padre, int edad, String nombre, String colorPiel, String ID, String Nacionalidad, String Lugar_Nacimiento) {
        this.familiar_padre = familiar_padre;
        this.edad = edad;
        this.nombre = nombre;
        this.colorPiel = colorPiel;
        this.ID = ID;
        this.Nacionalidad = Nacionalidad;
        this.Lugar_Nacimiento = Lugar_Nacimiento;
    }
        
    
    

    public Familiar getFamiliar_padre() {
        return familiar_padre;
    }

    public void setFamiliar_padre(Familiar familiar_padre) {
        this.familiar_padre = familiar_padre;
    }

    public ArrayList<Familiar> getFamiliares_Hijos() {
        return familiares_Hijos;
    }

    public void setFamiliares_Hijos(ArrayList<Familiar> familiares_Hijos) {
        this.familiares_Hijos = familiares_Hijos;
    }

    @Override
    public String toString() {
        return "Familiar{" + "familiar_padre=" + familiar_padre + ", familiares_Hijos=" + familiares_Hijos + '}';
    }
    
    
    
    
            
            
            
            
            
            
            
            
            
            
            
            
    
    
    
    
    
}
