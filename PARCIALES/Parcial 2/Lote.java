package parciales.PARCIAL3;
public class Lote {
    private double precio;
    private Comprador comprador;
    
    //constructor
    public Lote(){
        this.precio=50000;
        this.comprador=null;
    }
    public void agregarComprador(int dni, String nombre,String ciudad){
        this.comprador= new Comprador(dni, nombre,ciudad);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    @Override
    public String toString() {
        return "Lote{" + "precio=" + precio + ", comprador=" + comprador + '}';
    }
    
}
