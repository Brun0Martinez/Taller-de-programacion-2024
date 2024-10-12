package parciales.PARCIAL1;
public class Parcial1 {
    public static void main(String[] args) {
        AlumndoDeGrado alumnoGrado = new AlumndoDeGrado("Licenciatura en sistemas", 45613488,"Bruno",3);
        AlumnoDeDoctorado alumnoDoctorado = new AlumnoDeDoctorado("Ingeniero","UNLP",45235467,"Pedro",2);
        
        alumnoDoctorado.agregarMateria(new MateriaAprobada("Cadp",4,"3/4/2023"));
        alumnoDoctorado.agregarMateria(new MateriaAprobada("Tesis",5,"2/1/2022"));
        
        alumnoGrado.agregarMateria(new MateriaAprobada("Matemamtica 1",8,"6/8/2024"));
        alumnoGrado.agregarMateria(new MateriaAprobada("Matemamtica 2",9,"1/7/2023"));
        alumnoGrado.agregarMateria(new MateriaAprobada("Tesis",5,"2/4/2023"));
        
        System.out.println(alumnoDoctorado.toString());
        System.out.println(alumnoGrado.toString());
    }
}
