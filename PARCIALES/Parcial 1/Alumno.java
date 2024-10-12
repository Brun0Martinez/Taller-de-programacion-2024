package parciales.PARCIAL1;
public class Alumno {
    private int dni;
    private String nombre;
    private MateriaAprobada  [] vectorMateria;
    private int cantidadMaximaMaterias;
    private int cantidadActualMaterias=0;
    //constructor 
    public Alumno(int unDni, String unNombre, MateriaAprobada unaMateriaAprobada, int n){
        this.dni=unDni;
        this.nombre=unNombre;
        this.cantidadMaximaMaterias=n;
        this.vectorMateria= new MateriaAprobada[n];
    }
    //getters and setters
    //metodos
    public void agregarMateria(MateriaAprobada unaMateriaAprobada){
        vectorMateria[cantidadActualMaterias]=unaMateriaAprobada;
        cantidadActualMaterias++;
    }
    public boolean alumnoGraduado(){
        boolean graduado=false;
        int i=0;
        while(i<getCantidadMaximaMaterias()){
            if(vectorMateria[i].getNombre().equals("Tesis"));
                graduado=true;
            i++;
        }
        if(i==getCantidadMaximaMaterias())
            graduado=true;
        else
            graduado=false;
        return graduado;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadMaximaMaterias() {
        return cantidadMaximaMaterias;
    }

    public void setCantidadMaximaMaterias(int cantidadMaximaMaterias) {
        this.cantidadMaximaMaterias = cantidadMaximaMaterias;
    }

    public int getCantidadActualMaterias() {
        return cantidadActualMaterias;
    }

    public void setCantidadActualMaterias(int cantidadActualMaterias) {
        this.cantidadActualMaterias = cantidadActualMaterias;
    }
    @Override
    public String toString(){
        String aux="El DNI del alumno es: "+ getDni()+
                    " con nombre "+getNombre();
        for(int i=0;i<getCantidadMaximaMaterias();i++)
            aux=aux+vectorMateria[i].toString();
        return aux;
    }
}