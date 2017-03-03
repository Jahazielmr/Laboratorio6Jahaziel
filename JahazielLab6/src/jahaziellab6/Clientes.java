package jahaziellab6;

import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

public class Clientes extends Persona{
    
   private int ticket;
    private float sueldo;
    private ArrayList <Ordenes> ordenes;

    public Clientes() {
        super();
    }

    public Clientes(int ticket, float sueldo, ArrayList<Ordenes> ordenes, int edad, String nombre, String colorPiel, String ID, String Nacionalidad, String Lugar_Nacimiento, DefaultTreeModel arbo_genealogico, Familiar familiar) {
        super(edad, nombre, colorPiel, ID, Nacionalidad, Lugar_Nacimiento, arbo_genealogico, familiar);
        this.ticket = ticket;
        this.sueldo = sueldo;
        this.ordenes = ordenes;
    }

   

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Ordenes> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Ordenes> ordenes) {
        this.ordenes = ordenes;
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
