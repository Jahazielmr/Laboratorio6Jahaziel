package jahaziellab6;

public class ArticuloVenta {
    
    private int ID;
    private float precio;

    public ArticuloVenta() {
    }

    public ArticuloVenta(float precio) {
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return precio;
    }
    
    
    
    
    
    
    
    
    
    
    
}
