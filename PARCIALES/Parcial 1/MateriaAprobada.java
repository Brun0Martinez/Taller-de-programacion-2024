package parciales.PARCIAL1;
public class MateriaAprobada {
    private String nombre;
    private int nota;
    private String fecha;
    
    //constructor 
    public MateriaAprobada(String unNombre, int unaNota, String unaFecha){
        this.nombre=unNombre;
        this.nota=unaNota;
        this.fecha=unaFecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNota() {
        return nota;
    }

    public String getFecha() {
        return fecha;
    }
    @Override
    public String toString(){
        String aux=" nombre "+getNombre()+
                " nota "+getNota()+" fecha "+
                getFecha();
        return aux;
    }
}
