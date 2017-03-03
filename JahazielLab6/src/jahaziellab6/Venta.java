package jahaziellab6;

import java.util.Date;

public class Venta {
    
    private Clientes cliente;
    private Empleados empleado_atiende;
    private float total;
    Date fechaVenta;

    public Venta() {
    }

    public Venta(Clientes cliente, Empleados empleado_atiende, float total, Date fechaVenta) {
        this.cliente = cliente;
        this.empleado_atiende = empleado_atiende;
        this.total = total;
        this.fechaVenta = fechaVenta;
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

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", empleado_atiende=" + empleado_atiende + ", total=" + total + ", fechaVenta=" + fechaVenta + '}';
    }
    
    
    
    
    
    
}
