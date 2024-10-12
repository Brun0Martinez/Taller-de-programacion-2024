package parciales.PARCIAL1;
public class AlumnoDeDoctorado extends Alumno{
    private String tituloUniversitario;
    private String universidadOrigen;

    public AlumnoDeDoctorado(String tituloUniversitario, String universidadOrigen, int unDni, String unNombre,int n){
        super(unDni, unNombre,null, n);
        this.tituloUniversitario = tituloUniversitario;
        this.universidadOrigen = universidadOrigen;
    }
    @Override
    public String toString(){
        String aux=super.toString()+" Esta graduado en "+
                getTituloUniversitario()+" en la universidad"+
                getUniversidadOrigen();
        return aux;
    }    
    public String getTituloUniversitario() {
        return tituloUniversitario;
    }
    public String getUniversidadOrigen() {
        return universidadOrigen;
    }
}
