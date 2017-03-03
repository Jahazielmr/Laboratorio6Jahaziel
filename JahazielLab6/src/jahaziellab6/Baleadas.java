package jahaziellab6;

import java.util.ArrayList;

public class Baleadas extends ArticuloVenta{
    
    private ArrayList <String> ingredientes;

    public Baleadas() {
        super();
    }
    
    public Baleadas(ArrayList<String> ingredientes, float precio) {
        super(precio);
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return super.toString()+"Baleadas{" + "ingredientes=" + ingredientes + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
