package jahaziellab6;

import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;

public class Clientes extends Persona{
    
   private int ticket;
    private float Dinero_Diponible;
    private ArrayList <Ordenes> ordenes;

    public Clientes() {
        super();
    }

    public Clientes(int ticket, float Dinero_Disponible, int edad, String nombre, String colorPiel, String ID, String Nacionalidad, String Lugar_Nacimiento, JTree arbo_genealogico, Familiar familiar) {
        super(edad, nombre, colorPiel, ID, Nacionalidad, Lugar_Nacimiento, arbo_genealogico, familiar);
        this.ticket = ticket;
        this.Dinero_Diponible = Dinero_Disponible;
        this.ordenes = ordenes;
    }

   

   

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public float getDinero_Diponible() {
        return Dinero_Diponible;
    }

    public void setDinero_Diponible(float Dinero_Diponible) {
        this.Dinero_Diponible = Dinero_Diponible;
    }

    

    public ArrayList<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Ordenes> ordenes) {
        this.ordenes = ordenes;
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
