package jahaziellab6;

public class gatos extends ArticuloVenta{
    
    private int altura, peso;

    public gatos() {
        super();
    }

    public gatos(int altura, int peso, float precio) {
        super(precio);
        this.altura = altura;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "gatos{" + "altura=" + altura + ", peso=" + peso + '}';
    }

    
    
    
    
    
}
