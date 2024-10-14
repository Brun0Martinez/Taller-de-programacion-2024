package parciales.PARCIAL3;
public class Comprador {
    private int DNI;
    private String nombre;
    private String ciudad;
    
    //constructor
    public Comprador(int DNI, String nombre, String ciudad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Comprador{" + "DNI=" + DNI + ", nombre=" + nombre + ", ciudad=" + ciudad + '}';
    }
    
}
