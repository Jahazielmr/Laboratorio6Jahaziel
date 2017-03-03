package jahaziellab6;

public class ArticuloVenta {
    
    private float precio;

    public ArticuloVenta() {
    }

    public ArticuloVenta(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ArticuloVenta{" + "precio=" + precio + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
