package jahaziellab6;

import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

public class Familiar extends Persona {
    
    private Familiar familiar_padre;
    private ArrayList  familiares_Hijos = new ArrayList();

    public Familiar() {
        super();
    }

    public Familiar(ArrayList familiares_Hijos, Familiar familiar_padre, int edad, String nombre, String colorPiel, String ID, String Nacionalidad, String Lugar_Nacimiento, JTree arbo_genealogico, ArrayList <Familiar> familiar) {
        super(edad, nombre, colorPiel, ID, Nacionalidad, Lugar_Nacimiento, arbo_genealogico, familiar);
        this.familiar_padre = familiar_padre;
    }

    public Familiar getFamiliar_padre() {
        return familiar_padre;
    }

    public void setFamiliar_padre(Familiar familiar_padre) {
        this.familiar_padre = familiar_padre;
    }

  
    
    public ArrayList getFamiliares_Hijos() {
        return familiares_Hijos;
    }

    public void setFamiliares_Hijos(ArrayList familiares_Hijos) {
        this.familiares_Hijos = familiares_Hijos;
    }

    @Override
    public String toString() {
        return super.toString()+"Familiar{" + "familiar_padre=" + familiar_padre + ", familiares_Hijos=" + familiares_Hijos + '}';
    }
    
    
    
    
            
            
            
            
            
            
            
            
            
            
            
            
    
    
    
    
    
}
