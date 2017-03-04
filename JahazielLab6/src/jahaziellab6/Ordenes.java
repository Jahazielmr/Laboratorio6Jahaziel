package jahaziellab6;

import java.util.ArrayList;
import java.util.Date;

class Ordenes {
    
    private ArrayList<ArticuloVenta> articulos;
    private int Cantidad_articulos;
    private Clientes cliente;
    private Empleados empleado_atiende;
    private float total;
    Date fechaVenta;
    
    
    

    public Ordenes() {
    }

    public Ordenes(ArrayList<ArticuloVenta> articulos, int Cantidad_articulos, Clientes cliente, Empleados empleado_atiende, float total, Date fechaVenta) {
        this.articulos = articulos;
        this.Cantidad_articulos = Cantidad_articulos;
        this.cliente = cliente;
        this.empleado_atiende = empleado_atiende;
        this.total = total;
        this.fechaVenta = fechaVenta;
    }

    public int getCantidad_articulos() {
        return Cantidad_articulos;
    }

    public void setCantidad_articulos(int Cantidad_articulos) {
        this.Cantidad_articulos = Cantidad_articulos;
    }

    

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Empleados getEmpleado_atiende() {
        return empleado_atiende;
    }

    public void setEmpleado_atiende(Empleados empleado_atiende) {
        this.empleado_atiende = empleado_atiende;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    

    public ArrayList<ArticuloVenta> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<ArticuloVenta> articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "articulos=" + articulos + ", cliente=" + cliente + ", empleado_atiende=" + empleado_atiende + ", total=" + total + ", fechaVenta=" + fechaVenta + '}';
    }

   
    
    
    
    
    
    
    
}
