package parciales.PARCIAL1;
public class AlumndoDeGrado extends Alumno {
    private String carrera;

    public AlumndoDeGrado(String carrera, int unDni, String unNombre, int n) {
        super(unDni, unNombre,null, n);
        this.carrera = carrera;
    }
    @Override
    public String toString(){
        String aux=super.toString()+
                " Esta graduado en "+getCarrera();
        return aux;
    }
    public String getCarrera() {
        return carrera;
    }
   
}
